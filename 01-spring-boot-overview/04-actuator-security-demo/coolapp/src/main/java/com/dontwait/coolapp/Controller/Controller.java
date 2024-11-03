package com.dontwait.coolapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, Spring Boot!";
    }
    @GetMapping("/workout")
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping("/konichiwa")
    public String greetings() {
        return "Konnichiwa, World!";
    }
}
