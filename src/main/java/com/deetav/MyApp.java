package com.deetav;

import com.deetav.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyApp {

    // Qualifier Annotations is used to give hint to the spring to pick app. beam
    @Qualifier("frenchGreetingService")
    @Autowired
    GreetingService greetingService;
    public void sendMessage(){
        greetingService.greet();
    }
}
