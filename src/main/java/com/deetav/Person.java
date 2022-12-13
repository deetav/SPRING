package com.deetav;

import org.springframework.stereotype.Component;
// This will create a person beam and keep it inside the spring container
@Component
public class Person {
    private String name;
    private int age;
    public void dance(){
        System.out.println("Dancing in the spring!");
    }
}
