package dev.mohsenkohan.diexample.controllers;

import dev.mohsenkohan.diexample.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private final GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
