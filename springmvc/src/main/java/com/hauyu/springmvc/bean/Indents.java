package com.hauyu.springmvc.bean;

import java.util.Date;

public class Indents {
    private String indentid;
    private String time;
    private Integer userid;
    private Integer money;
    private Integer nomber;
    private Date date;
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


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

    public Integer getNomber() {
        return nomber;
    }

    public void setNomber(Integer nomber) {
        this.nomber = nomber;
    }
}
