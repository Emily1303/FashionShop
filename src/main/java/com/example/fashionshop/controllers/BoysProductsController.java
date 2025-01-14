package com.example.fashionshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoysProductsController {

    @GetMapping("/МОМЧЕТА")
    public String boysProductsPage() {

        return "products-for-boys";
    }
}
