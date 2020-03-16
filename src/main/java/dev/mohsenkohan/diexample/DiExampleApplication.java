package dev.mohsenkohan.diexample;

import dev.mohsenkohan.diexample.controllers.ConstructorInjectedController;
import dev.mohsenkohan.diexample.controllers.HelloController;
import dev.mohsenkohan.diexample.controllers.PropertyInjectedController;
import dev.mohsenkohan.diexample.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiExampleApplication.class, args);

        System.out.println("---------- PRIMARY");
        HelloController helloController = (HelloController) context.getBean("helloController");
        System.out.println(helloController.sayHello());

        System.out.println("---------- Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---------- Setter");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------- Constructor");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
