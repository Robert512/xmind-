package javabasic.framework;

import javabasic.framework.ioc.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FrameworkApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FrameworkApplication.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        person.call();

    }
}
