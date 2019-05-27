package com.itlike.demo1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void test(){
        //  1.  加载配置文件
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.name);

    }
}
