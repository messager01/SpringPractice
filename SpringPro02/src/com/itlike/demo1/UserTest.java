package com.itlike.demo1;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test(){
        //  1.  加载配置文件
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) applicationContext.getBean("user");
        User user1 = (User) applicationContext.getBean("user");
        System.out.println(user == user1);
        System.out.println(user.name);
        System.out.println(user.dog.name);
        applicationContext.close();
    }
}
