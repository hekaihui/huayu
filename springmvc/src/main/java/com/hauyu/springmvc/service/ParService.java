package com.hauyu.springmvc.service;

import com.hauyu.springmvc.bean.Particular;
import com.hauyu.springmvc.dao.ParDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("parService")
public class ParService {
    //@Autowired
    @Resource(name = "parDao")
    private ParDao parDao;

    public ParDao getParDao() {
        return parDao;
    }

    public void setParDao(ParDao parDao) {
        this.parDao = parDao;
    }
    @Transactional(readOnly = true)
    public List<Particular> select1(String indentid){
        return  parDao.select1(indentid);
    }
    public void save(Particular particular){
        parDao.save(particular);
    }
    public void delete(Particular particular){
        parDao.delete(particular);
    }
}
