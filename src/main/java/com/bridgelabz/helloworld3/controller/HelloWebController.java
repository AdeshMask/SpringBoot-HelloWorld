package com.bridgelabz.helloworld3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWebController {
    @RequestMapping("/")
    public String hello(){
        return "Hello From Bridgelabz";
    }
}
