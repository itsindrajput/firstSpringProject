package com.example.firstSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myclass {
    @GetMapping("hey")
    public String sayHello(){
        return "Hello!";
    }
}