package com.bridgelabz.helloworld3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloWebController {
    @GetMapping("/web")
    public String Hello(){
        return "hello";
    }
    @GetMapping("/webs")
    public String message(Model model){
        model.addAttribute("message","This is a custom message");
        return "message";
    }
}
