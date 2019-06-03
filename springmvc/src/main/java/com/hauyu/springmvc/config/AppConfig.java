package com.hauyu.springmvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

public class AppConfig implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 创建Spring的root配置环境
        AnnotationConfigWebApplicationContext rootContext =
                new AnnotationConfigWebApplicationContext();
        rootContext.register(Compan.class);

        // 将Spring的配置添加为listener
        servletContext.addListener(new ContextLoaderListener(rootContext));

     //添加过滤器
        FilterRegistration.Dynamic filter = servletContext.addFilter(CharacterEncodingFilter.class.getSimpleName(), CharacterEncodingFilter.class);
        EnumSet<DispatcherType> dispatcherTypes = EnumSet
                .allOf(DispatcherType.class);
        dispatcherTypes.add(DispatcherType.REQUEST);
        dispatcherTypes.add(DispatcherType.FORWARD);

        filter.addMappingForUrlPatterns(dispatcherTypes, true, "/*");


   //Spingmvc前端控制器
        DispatcherServlet dispatcherServlet=new DispatcherServlet();
        dispatcherServlet.setContextConfigLocation("classpath:Springmvc.xml");
        ServletRegistration.Dynamic dynamic=servletContext.addServlet("dispatcherServlet",dispatcherServlet);
        dynamic.addMapping("*.stu");
    }
}
