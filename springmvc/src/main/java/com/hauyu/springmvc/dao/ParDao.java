package com.hauyu.springmvc.dao;

import com.hauyu.springmvc.bean.Particular;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("parDao")

public class ParDao {
    //@Autowired
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    public List<Particular> select1(String indentid){
        return (List<Particular>)hibernateTemplate.find("from Particular where indentid=?",indentid);
    }
    public void save(Particular particular){
        hibernateTemplate.save(particular);
    }
    public void delete(Particular particular){
        hibernateTemplate.delete(particular);
    }

}
