package com.example.fashionshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GirlsProductsController {

    @GetMapping("/МОМИЧЕТА")
    public String girlsProductsPage() {

        return "products-for-girls";
    }
}
