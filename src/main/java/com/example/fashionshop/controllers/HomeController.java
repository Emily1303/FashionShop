package com.example.fashionshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String indexPage(Model model) {

        return "index";
    }

    @GetMapping("/home")
    public String homePage() {

        return "home";
    }
}
