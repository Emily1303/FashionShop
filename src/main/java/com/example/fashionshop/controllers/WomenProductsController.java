package com.example.fashionshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WomenProductsController {

    @GetMapping("/ЖЕНИ")
    public String womenProductsPage() {

        return "products-for-women";
    }
}
