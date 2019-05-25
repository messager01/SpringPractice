package com.itlike.demo3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    public String name;
    public Integer age;
    public Dog dog;
    public String[] attr;
    public List mylist;
    public Set myset;
    public Map mymap;


    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String[] getAttr() {
        return attr;
    }

    public void setAttr(String[] attr) {
        this.attr = attr;
    }


    public List getMylist() {
        return mylist;
    }

    public void setMylist(List mylist) {
        this.mylist = mylist;
    }


    public Set getMyset() {
        return myset;
    }

    public void setMyset(Set myset) {
        this.myset = myset;
    }

    public Map getMymap() {
        return mymap;
    }

    public void setMymap(Map mymap) {
        this.mymap = mymap;
    }
}
