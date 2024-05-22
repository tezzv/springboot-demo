package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "This is Home Page";
    }

    @RequestMapping("/tj")
    public String tj(){
        return "Deploy by tejveer";
    }

}
