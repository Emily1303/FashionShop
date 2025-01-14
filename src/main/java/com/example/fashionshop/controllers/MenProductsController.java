package com.example.fashionshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenProductsController {

    @GetMapping("/МЪЖЕ")
    public String menProductsPage() {

        return "products-for-men";
    }
}
