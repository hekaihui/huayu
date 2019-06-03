package com.hauyu.springmvc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class UtilSqlSession {
    public SqlSession SqlSession() throws IOException {

        InputStream inputStream= Resources.getResourceAsStream("mybatis.config.xml");
        //创建回话工厂，传入mybatis核心配置文件
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂得到sqlsession
        return sqlSessionFactory.openSession(true);
    }
}
