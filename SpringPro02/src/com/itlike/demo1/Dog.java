package com.itlike.demo1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {
    @Value("狗子")
    public String name;

}
