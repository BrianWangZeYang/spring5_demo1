package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/6/27 8:54
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //1、加载spring的配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook1(){
        //1、加载spring的配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders(){
        //1、加载spring的配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置创建的对象
        Orders order = context.getBean("orders", Orders.class);
        System.out.println(order);
        order.orderTest();
    }
}
