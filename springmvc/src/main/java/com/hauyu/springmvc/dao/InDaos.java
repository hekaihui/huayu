package com.hauyu.springmvc.dao;

import com.hauyu.springmvc.bean.Indents;
import com.hauyu.springmvc.util.UtilSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository("inDaos")
 public class InDaos {
 UtilSqlSession utilSqlSession=new UtilSqlSession();

  
  /**
   *查询列表
   * @return
   */
 public List<Indents> select() throws  IOException{
   SqlSession sqlSession=utilSqlSession.SqlSession();
   return sqlSession.selectList("in.select");
 }

  /**
   * 查询一条数据
   * @param indentid
   * @return
   */

  public Indents  select1(String indentid) throws IOException {
   SqlSession sqlSession=utilSqlSession.SqlSession();
   return    sqlSession.selectOne("in.selectbyid",indentid);
  }


  /**
   * 添加
   * @param indents
   */
 public void save(Indents indents) throws IOException {
  SqlSession sqlSession= utilSqlSession.SqlSession();
  int i =sqlSession.insert("in.insert",indents);
  System.out.println(i);
 }

  /**
   * 删除
   * @param indents
   */
 public void delete(Indents indents) throws IOException{
      SqlSession sqlSession= utilSqlSession.SqlSession();
        sqlSession.delete("in.delete",indents);

 }

  /**
   * 修改
   * @param indents
   */
 public void update(Indents indents) throws IOException {
  SqlSession sqlSession=utilSqlSession.SqlSession();
  sqlSession.update("in.update",indents);
 }


}
