package com.itlike.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){

        //  1.  加载配置文件
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.name);

        //   关闭工厂
        applicationContext.close();

    }
}
