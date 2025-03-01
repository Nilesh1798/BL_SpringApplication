package com.example.FirstSpringApp.controller;

import com.example.FirstSpringApp.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/hello")
    public Hello sayHello() {
        return new Hello("Hello, Nilesh Here..!");
    }
}
