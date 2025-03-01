package com.example.FirstSpringApp.controller;
import com.example.FirstSpringApp.model.Hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloWorldController {

    @GetMapping("/test")
    public String testPage(Model model) {

        Hello hh = new Hello("Hello BridgeLabz!");
        model.addAttribute("message", hh);
        return "test";
    }
}
