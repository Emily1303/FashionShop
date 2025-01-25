package com.example.fashionshop.controllers;

import com.example.fashionshop.services.ProductGroupsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GirlsProductsController {

    private final ProductGroupsService productGroupsService;

    public GirlsProductsController(ProductGroupsService productGroupsService) {
        this.productGroupsService = productGroupsService;
    }

    @GetMapping("/МОМИЧЕТА")
    public String girlsProductsIndexPage(Model model) {

        if (!model.containsAttribute("girlsProducts")) {
            model.addAttribute("girlsProducts", productGroupsService.getAllProductGroupsForGirlsCategory());
        }

        return "products-for-girls";
    }

    @GetMapping("/home/МОМИЧЕТА")
    public String girlsProductsHomePage(Model model) {

        if (!model.containsAttribute("girlsProducts")) {
            model.addAttribute("girlsProducts", productGroupsService.getAllProductGroupsForGirlsCategory());
        }

        return "products-for-girls";
    }

}
