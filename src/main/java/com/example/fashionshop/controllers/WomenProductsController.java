package com.example.fashionshop.controllers;

import com.example.fashionshop.models.entities.Categories;
import com.example.fashionshop.models.enums.CategoriesEnum;
import com.example.fashionshop.repositories.CategoriesRepository;
import com.example.fashionshop.services.ProductGroupsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WomenProductsController {

    private final ProductGroupsService productGroupsService;

    private final CategoriesRepository categoriesRepository;

    public WomenProductsController(ProductGroupsService productGroupsService, CategoriesRepository categoriesRepository) {
        this.productGroupsService = productGroupsService;
        this.categoriesRepository = categoriesRepository;
    }

    @GetMapping("/ЖЕНИ")
    public String womenProductsIndexPage(Model model) {
        Categories categories = categoriesRepository.findByCategoriesEnum(CategoriesEnum.ЖЕНИ).get();

        if (!model.containsAttribute("womenProducts")) {
            model.addAttribute("womenProducts", productGroupsService.getAllProductGroupsForWomenCategory());
        }

        model.addAttribute("womenCategory", categories);

        return "product-groups-for-women";
    }

    @GetMapping("/home/ЖЕНИ")
    public String womenProductsHomePage(Model model) {

        if (!model.containsAttribute("womenProducts")) {
            model.addAttribute("womenProducts", productGroupsService.getAllProductGroupsForWomenCategory());
        }

        return "product-groups-for-women";
    }

}
