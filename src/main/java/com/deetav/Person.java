package com.deetav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// This will create a person beam and keep it inside the spring container
// Person has a car -> true
@Component
public class Person {
    private String name;
    private int age;
    // tells spring that beam created for car should be injected here
    @Autowired
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void dance(){
        System.out.println("Dancing in the spring!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
