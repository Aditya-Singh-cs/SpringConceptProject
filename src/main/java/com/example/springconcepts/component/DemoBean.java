package com.example.springconcepts.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    public DemoBean() {
        System.out.println("DemoBean is initialized");
    }

    @Override
    public String toString() {
        return "This is a DemoBean instance";
    }
}
