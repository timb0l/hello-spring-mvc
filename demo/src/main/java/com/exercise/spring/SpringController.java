package com.exercise.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SpringController {
    @GetMapping
    public String greetings(){
        return "homepage";
    }

    @GetMapping ("/about")
    public String aboutUs(){
        return "about";
    }

    @GetMapping ("/terms")
    public String termsAndConditions(){
        return "terms";
    }
}
