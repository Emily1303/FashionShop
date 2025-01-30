package com.example.fashionshop.controllers;

import com.example.fashionshop.models.entities.Categories;
import com.example.fashionshop.models.entities.ProductGroups;
import com.example.fashionshop.models.enums.CategoriesEnum;
import com.example.fashionshop.repositories.CategoriesRepository;
import com.example.fashionshop.repositories.ProductGroupsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GetAllProductGroups {

    private final ProductGroupsRepository productGroupsRepository;

    private final CategoriesRepository categoriesRepository;

    public GetAllProductGroups(ProductGroupsRepository productGroupsRepository, CategoriesRepository categoriesRepository) {
        this.productGroupsRepository = productGroupsRepository;
        this.categoriesRepository = categoriesRepository;
    }

    @GetMapping("/categories/{category}/groups")
    public List<String> getProductGroupsByCategory(@PathVariable("category") String category) {
        Categories categories = categoriesRepository.findByCategoriesEnum(CategoriesEnum.valueOf(category)).get();
        List<ProductGroups> productGroups = productGroupsRepository.findByCategories(categories).get();

        List<String> productGroupsNames = new ArrayList<>();
        for (int i = 0; i < productGroups.size(); i++) {
            String productGroupName = productGroups.get(i).getProductGroupName();
            productGroupsNames.add(productGroupName);
        }

        return productGroupsNames;
    }
}
