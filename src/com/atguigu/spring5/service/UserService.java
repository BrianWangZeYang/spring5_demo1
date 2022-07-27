package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/6/28 8:58
 */
public class UserService {

    //第一步：创建UserDao类型属性，生成set方法。通过set方法完成注入
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.............");
        userDao.update();
    }
}
