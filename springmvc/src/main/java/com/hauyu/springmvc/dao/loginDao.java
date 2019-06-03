package com.hauyu.springmvc.dao;

import com.hauyu.springmvc.bean.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("loginDao")
public class loginDao {
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    public User select(User user){
        return  (User) hibernateTemplate.find("from User where name=? and password=?",user.getName(),user.getPassword()).get(0);
    }

}
