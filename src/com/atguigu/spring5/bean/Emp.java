package com.atguigu.spring5.bean;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/6/28 11:59
 */
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    //为了级联赋值，此处需获得Dept对象才能赋值
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept );
    }
}
