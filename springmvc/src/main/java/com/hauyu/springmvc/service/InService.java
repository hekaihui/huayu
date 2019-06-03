package com.hauyu.springmvc.service;

import com.hauyu.springmvc.bean.Indents;
import com.hauyu.springmvc.dao.InDaos;
import com.hauyu.springmvc.exception.MyExceptions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Transactional
    @Service("inService")
public class InService {
   // @Autowired
    @Resource(name = "inDaos")
    private InDaos inDaos;

    public void setInDaos(InDaos inDaos) {
        this.inDaos = inDaos;
    }
    @Transactional(readOnly = true)
    public Indents select1(String indentid) throws IOException {
        return inDaos.select1(indentid);
    }

   @Transactional(readOnly = true)
    public List<Indents> select() throws  IOException {

        return inDaos.select();
    }

    public void save(Indents indents) throws MyExceptions, IOException {
            inDaos.save(indents);
    }
    public void delete(Indents indents) throws MyExceptions, IOException {
      inDaos.delete(indents);
    }

    @Transactional
    public void update(Indents indents) throws  IOException {
            inDaos.update(indents);
    }
}
