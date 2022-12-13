package com.deetav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello Spring!");

        // now i wish to retrieve person beam from spring container
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.deetav");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
