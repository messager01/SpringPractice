package com.itlike.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.naming.Name;

@Component("user")
@Scope("prototype")
public class User {
    @Value("howard")
    public String name;

    //@Autowired     //根据类型来注入
    @Resource(name = "dog")
    public Dog dog;



    @PostConstruct     // 标识该方法在对象初始化时调用
    public void init(){
        System.out.println("初始化调用");
    }



    @PreDestroy
    public void destroy(){
        System.out.println("  销毁前调用");
    }
}
