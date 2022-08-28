package com.example.demodrawing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDrawingApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoDrawingApplication.class, args);
    }
    // in DrawSomething bean, the annotation @EventListener(ApplicationReadyEvent.class) triggers the instanciation
    // of the bean when application is ready (all the beans are registered in the ioc container, ...)
    // bean DrawCircle is defined as primary, to set the default shape (which will be used when refering to the interface instead of a class)
}



