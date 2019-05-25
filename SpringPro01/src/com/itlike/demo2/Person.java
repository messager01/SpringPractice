package com.itlike.demo2;

public class Person {
    public String name;


    public void init(){
        System.out.println("初始化对象");
    }

    public void destroy(){
        System.out.println("销毁对象");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
