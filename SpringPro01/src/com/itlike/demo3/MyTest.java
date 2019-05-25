package com.itlike.demo3;

import com.itlike.demo2.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import java.util.Arrays;

public class MyTest {

    @Test
    public void test(){

        //  1.  加载配置文件
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.age+"   "+student.name+"  "+student.dog);
        System.out.println(Arrays.toString(student.attr));
        System.out.println(student.mylist.get(0));
        System.out.println(student.myset);
        System.out.println(student.mymap.get("key1"));
        System.out.println(student.mymap.entrySet());
    }
}
