package dev.mohsenkohan.diexample;

import dev.mohsenkohan.diexample.controllers.*;
import dev.mohsenkohan.diexample.propertybeans.FakeDataSource;
import dev.mohsenkohan.diexample.propertybeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
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

        System.out.println("---------- International");
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("---------- Datasource Properties");
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource);

        System.out.println("---------- Jms Properties");
        FakeJmsBroker fakeJmsBroker = context.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker);
    }

}
