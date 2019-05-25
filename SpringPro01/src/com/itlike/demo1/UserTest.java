package com.itlike.demo1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test1(){
        //  1.  加载配置文件
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
        userDao.delete();
    }


    @Test
    public void test2(){
        //  1.  加载配置文件
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDaoMySQLImpl userDao = (UserDaoMySQLImpl) applicationContext.getBean("userDao");
        System.out.println(userDao.name);
    }


}
