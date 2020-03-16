package dev.mohsenkohan.diexample.controllers;

import dev.mohsenkohan.diexample.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
