package com.example.fashionshop.controllers;

import com.example.fashionshop.models.entities.ProductGroups;
import com.example.fashionshop.services.ProductGroupsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoysProductsController {

    private final ProductGroupsService productGroupsService;

    public BoysProductsController(ProductGroupsService productGroupsService) {
        this.productGroupsService = productGroupsService;
    }

    @GetMapping("/МОМЧЕТА")
    public String boysProductsIndexPage(Model model) {

        if (!model.containsAttribute("boysProducts")) {
            model.addAttribute("boysProducts", productGroupsService.getAllProductGroupsForBoysCategory());
        }

        return "products-for-boys";
    }

    @GetMapping("/home/МОМЧЕТА")
    public String boysProductsHomePage(Model model) {

        if (!model.containsAttribute("boysProducts")) {
            model.addAttribute("boysProducts", productGroupsService.getAllProductGroupsForBoysCategory());
        }

        return "products-for-boys";
    }

}
