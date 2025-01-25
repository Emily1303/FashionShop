package com.example.fashionshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LoadProductsController {

    @GetMapping("/ЖЕНИ/{name}")
    public String getAllProductsForWomenIndexPage(@PathVariable("name") String name) {

        return "products";
    }

    @GetMapping("/МЪЖЕ/{name}")
    public String getAllProductsForMenIndexPage(@PathVariable("name") String name) {

        return "products";
    }

    @GetMapping("/МОМИЧЕТА/{name}")
    public String getAllProductsForGirlsIndexPage(@PathVariable("name") String name) {

        return "products";
    }

    @GetMapping("/МОМЧЕТА/{name}")
    public String getAllProductsForBoysIndexPage(@PathVariable("name") String name) {

        return "products";
    }

}
