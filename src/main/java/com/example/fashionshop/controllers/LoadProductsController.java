package com.example.fashionshop.controllers;

import com.example.fashionshop.models.entities.Categories;
import com.example.fashionshop.models.entities.Product;
import com.example.fashionshop.models.entities.ProductGroups;
import com.example.fashionshop.models.enums.CategoriesEnum;
import com.example.fashionshop.repositories.CategoriesRepository;
import com.example.fashionshop.repositories.ProductGroupsRepository;
import com.example.fashionshop.services.ProductGroupsService;
import com.example.fashionshop.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class LoadProductsController {

    private final ProductService productService;

    private final CategoriesRepository categoriesRepository;

    private final ProductGroupsRepository productGroupsRepository;

    private final ProductGroupsService productGroupsService;

    public LoadProductsController(ProductService productService, CategoriesRepository categoriesRepository,
                                  ProductGroupsRepository productGroupsRepository, ProductGroupsService productGroupsService) {
        this.productService = productService;
        this.categoriesRepository = categoriesRepository;
        this.productGroupsRepository = productGroupsRepository;
        this.productGroupsService = productGroupsService;
    }

    @GetMapping("/ЖЕНИ/{group}")
    public String getAllProductsForWomenIndexPage(@PathVariable("group") String group, Model model) {

        Categories womenCategory = categoriesRepository.findByCategoriesEnum(CategoriesEnum.ЖЕНИ).get();
        List<ProductGroups> productGroups = productGroupsRepository.findByCategories(womenCategory).get();
        ProductGroups neededProductGroup = productGroupsService.findProductGroupInListByName(productGroups, group);
        List<Product> allProductsForGroup = productService.getAllProductsForGroup(neededProductGroup);

        model.addAttribute("womenProductsList", allProductsForGroup);

        return "products";
    }

    @GetMapping("/МЪЖЕ/{group}")
    public String getAllProductsForMenIndexPage(@PathVariable("group") String group, Model model) {
        Categories menCategory = categoriesRepository.findByCategoriesEnum(CategoriesEnum.МЪЖЕ).get();
        List<ProductGroups> productGroups = productGroupsRepository.findByCategories(menCategory).get();
        ProductGroups neededProductGroup = productGroupsService.findProductGroupInListByName(productGroups, group);
        List<Product> allProductsForGroup = productService.getAllProductsForGroup(neededProductGroup);

        model.addAttribute("menProductsList", allProductsForGroup);

        return "products";
    }

    @GetMapping("/МОМИЧЕТА/{group}")
    public String getAllProductsForGirlsIndexPage(@PathVariable("group") String group, Model model) {
        Categories girlsCategory = categoriesRepository.findByCategoriesEnum(CategoriesEnum.МОМИЧЕТА).get();
        List<ProductGroups> productGroups = productGroupsRepository.findByCategories(girlsCategory).get();
        ProductGroups neededProductGroup = productGroupsService.findProductGroupInListByName(productGroups, group);
        List<Product> allProductsForGroup = productService.getAllProductsForGroup(neededProductGroup);

        model.addAttribute("girlsProductsList", allProductsForGroup);

        return "products";
    }

    @GetMapping("/МОМЧЕТА/{group}")
    public String getAllProductsForBoysIndexPage(@PathVariable("group") String group, Model model) {
        Categories boysCategory = categoriesRepository.findByCategoriesEnum(CategoriesEnum.МОМЧЕТА).get();
        List<ProductGroups> productGroups = productGroupsRepository.findByCategories(boysCategory).get();
        ProductGroups neededProductGroup = productGroupsService.findProductGroupInListByName(productGroups, group);
        List<Product> allProductsForGroup = productService.getAllProductsForGroup(neededProductGroup);

        model.addAttribute("boysProductsList", allProductsForGroup);

        return "products";
    }

}
