package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/6/28 9:21
 */
public class TestBean {
    @Test
     public void testAdd(){
         //1、加载Spring配置文件
         ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
         //2、获取配置创建的对象
         UserService userservice = context.getBean("userService", UserService.class);
         userservice.add();

     }
    @Test
    public void testBean2(){
        //1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        //2、获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();

    }

}
