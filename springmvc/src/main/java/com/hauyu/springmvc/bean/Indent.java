package com.hauyu.springmvc.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "indent")
public class Indent {
    @Id
    @Column(name = "indentid")
    private String indentid;
   @Size(min=1,max =10,message ="何凯回" )
    @Column(name = "time")
    private String time;
   /* @Range(min=1,max =10,message ="heehe" )*/
    @Column(name = "userid")
    private Integer userid;
    @Column(name = "money")
    private Integer money;
    @Column(name = "nomber")
    private Integer number;
    /*private List<Indent> list;

    public List<Indent> getList() {
        return list;
    }

    public void setList(List<Indent> list) {
        this.list = list;
    }*/

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   @DateTimeFormat(pattern = "yyyy-MM-dd")
   private Date date;

    public String getIndentid() {
        return indentid;
    }

    public void setIndentid(String indentid) {
        this.indentid = indentid;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
