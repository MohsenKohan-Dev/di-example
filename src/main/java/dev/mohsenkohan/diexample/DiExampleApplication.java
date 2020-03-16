package dev.mohsenkohan.diexample;

import dev.mohsenkohan.diexample.controllers.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiExampleApplication.class, args);

        HelloController helloController = (HelloController) context.getBean("helloController");

        String greeting = helloController.sayHello();

        System.out.println(greeting);
    }

}
