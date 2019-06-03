package com.hauyu.springmvc.service;

import com.hauyu.springmvc.bean.User;
import com.hauyu.springmvc.dao.loginDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("loginService")
public class loginService {
    public com.hauyu.springmvc.dao.loginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(com.hauyu.springmvc.dao.loginDao loginDao) {
        this.loginDao = loginDao;
    }
@Resource(name="loginDao")
 private loginDao loginDao;

    public User select(User user){
        if(loginDao.select(user)!=null){
            return null;
        }
        if(user.getName()==null || user.getPassword()==null){
            return null;
        }
        return loginDao.select(user);
    }

}
