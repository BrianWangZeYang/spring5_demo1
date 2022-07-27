package com.atguigu.spring5;

/**
 * @author xxx
 * @version 1.0
 * @Description 演示使用set方法进行注入属性
 * @date 2022/6/27 13:17
 */
public class Book {
    private String bname;
    private String bauthor;
    private String address;

    public Book() {
    }

    public Book(String bname, String bauthor,String address) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.address = address;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bname+"::"+bauthor+"::"+address);
    }

    //演示如何向Book类注入属性
    //第一种方法set方法注入
    //第二种方法有参构造方法注入
}
