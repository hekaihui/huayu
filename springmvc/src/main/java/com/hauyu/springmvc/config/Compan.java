package com.hauyu.springmvc.config;

import com.hauyu.springmvc.bean.Indent;
import com.hauyu.springmvc.bean.Particular;
import com.hauyu.springmvc.bean.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.beans.PropertyVetoException;
import java.util.Properties;

//标记这个类为一个spring的配置文件
@Configuration
//开启注解扫描
@ComponentScan(basePackages = "com.hauyu.springmvc")
//开启事务扫描
@EnableTransactionManagement
public class Compan {
    @Bean
    //配置数据源
    public ComboPooledDataSource comboPooledDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/ssh?serverTimezone=GMT");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        return dataSource;
    }
    @Bean
    //创建sessionfactory
    public LocalSessionFactoryBean sessionFactory() throws PropertyVetoException {
        LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
        //进入datesource
        sessionFactory.setDataSource(comboPooledDataSource());
        //创建propertist代替hibernate
        Properties properties=new Properties();
        properties.setProperty("hibernate.show_sql","true");
        properties.setProperty("hibernate.format_sql","true");
        properties.setProperty("dialect","org.hibernate.dialect.MySQLDialect");
        sessionFactory.setHibernateProperties(properties);
        //开启bean对实体类的扫描
        sessionFactory.setAnnotatedClasses(Indent.class,Particular.class, User.class);
        return sessionFactory;

    }


    @Bean
    public HibernateTemplate hibernateTemplate() throws PropertyVetoException {
        HibernateTemplate hibernateTemplate=new HibernateTemplate();
          hibernateTemplate.setSessionFactory                 (sessionFactory().getObject());
        return hibernateTemplate;
    }

    @Bean
    public HibernateTransactionManager hibernateTransactionManager() throws PropertyVetoException {
        HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
        return hibernateTransactionManager;
    }

}

