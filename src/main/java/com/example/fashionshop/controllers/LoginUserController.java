package com.example.fashionshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LoginUserController {

    @GetMapping("/login")
    public String login() {

        return "login-user";
    }

    public String onFailure(@ModelAttribute("email") String email, Model model) {

        model.addAttribute("email", email);
        model.addAttribute("bad_credentials", "true");

        return "login";
    }
}
