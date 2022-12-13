package com.deetav;

import com.deetav.greeting.GreetingService;
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
       Person person1 = (Person) ctx.getBean("person");
       Person person2 = (Person) ctx.getBean("person");
        System.out.println(person2.hashCode());
        System.out.println(person1.hashCode());
    }
}
