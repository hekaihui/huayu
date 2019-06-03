package com.hauyu.springmvc.dao;

import com.hauyu.springmvc.bean.Indent;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("inDao")
 public class InDao {
    //@Autowired
 @Resource(name = "hibernateTemplate")
  private HibernateTemplate hibernateTemplate;

  public HibernateTemplate getHibernateTemplate() {
      return hibernateTemplate;
  }

  public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
      this.hibernateTemplate = hibernateTemplate;
  }



  /**
   *查询列表
   * @return
   */
 public List<Indent> select(){
      return  (List<Indent>)hibernateTemplate.find("from Indent");
 }

  /**
   * 查询一条数据
   * @param indentid
   * @return
   */

  public Indent select1(String indentid){
   return    hibernateTemplate.get(Indent.class,indentid);
  }


  /**
   * 添加
   * @param indent
   */
 public void save(Indent indent){
      hibernateTemplate.save(indent);
 }

  /**
   * 删除
   * @param indent
   */
 public void delete(Indent indent){
      hibernateTemplate.delete(indent);
 }

  /**
   * 修改
   * @param indent
   */
 public void update(Indent indent){
        hibernateTemplate.update(indent);
  }


}
