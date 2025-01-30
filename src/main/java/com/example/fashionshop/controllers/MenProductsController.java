package com.example.fashionshop.controllers;

import com.example.fashionshop.services.ProductGroupsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenProductsController {

    private final ProductGroupsService productGroupsService;

    public MenProductsController(ProductGroupsService productGroupsService) {
        this.productGroupsService = productGroupsService;
    }

    @GetMapping("/МЪЖЕ")
    public String menProductsIndexPage(Model model) {

        if (!model.containsAttribute("menProducts")) {
            model.addAttribute("menProducts", productGroupsService.getAllProductGroupsForMenCategory());
        }

        return "product-groups-for-men";
    }

    @GetMapping("/home/МЪЖЕ")
    public String menProductsHomePage(Model model) {

        if (!model.containsAttribute("menProducts")) {
            model.addAttribute("menProducts", productGroupsService.getAllProductGroupsForMenCategory());
        }

        return "product-groups-for-men";
    }

}
