package com.atguigu.spring5.bean;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/6/28 11:58
 */
public class Dept {
    private String dname;


    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
