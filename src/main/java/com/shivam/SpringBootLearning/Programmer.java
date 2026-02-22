package com.shivam.SpringBootLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Autowired
    Computer computer;

    public void code() {
//        System.out.println("Coding");
        computer.compile();
    }

}
