package com.shivam.SpringBootLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLearningApplication {

    public static void main(String[] args) {

        ApplicationContext appContext = SpringApplication.run(SpringBootLearningApplication.class, args);
        // Used ApplicationContext to store the returned value from the run function
        System.out.println("Hello World!");

        //Normal object creation approach

//		Programmer programmer = new Programmer();
//		programmer.code();

        //Using Bean of Programmer class

        Programmer programmer = appContext.getBean(Programmer.class);
        programmer.code();


    }

}
