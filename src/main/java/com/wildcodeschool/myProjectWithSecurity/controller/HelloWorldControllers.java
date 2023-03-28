package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllers {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }
    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public String director() {
        return "WILD CODE SCHOOL BASES!!!";
    }
}
