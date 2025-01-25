package com.example.fashionshop.controllers;

import com.example.fashionshop.services.ProductGroupsService;
import com.example.fashionshop.services.impl.ProductGroupsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WomenProductsController {

    private final ProductGroupsService productGroupsService;

    public WomenProductsController(ProductGroupsService productGroupsService) {
        this.productGroupsService = productGroupsService;
    }

    @GetMapping("/ЖЕНИ")
    public String womenProductsIndexPage(Model model) {

        if (!model.containsAttribute("womenProducts")) {
            model.addAttribute("womenProducts", productGroupsService.getAllProductGroupsForWomenCategory());
        }

        return "products-for-women";
    }

    @GetMapping("/home/ЖЕНИ")
    public String womenProductsHomePage(Model model) {

        if (!model.containsAttribute("womenProducts")) {
            model.addAttribute("womenProducts", productGroupsService.getAllProductGroupsForWomenCategory());
        }

        return "products-for-women";
    }

}
