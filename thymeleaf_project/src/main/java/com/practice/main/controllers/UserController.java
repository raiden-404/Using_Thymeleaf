package com.practice.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
    @GetMapping("/index")
    public String getIndex(Model model){
        model.addAttribute("name","Yuvi");
        System.out.println("In Index Page");
        return "index";
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
    
    
}