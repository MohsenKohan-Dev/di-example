package dev.mohsenkohan.diexample.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String sayHello() {
        System.out.println("Hello World!");

        return "Hi Folks!";
    }
}
