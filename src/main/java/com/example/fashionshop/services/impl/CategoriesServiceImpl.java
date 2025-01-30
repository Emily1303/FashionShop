package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.entities.Categories;
import com.example.fashionshop.models.enums.CategoriesEnum;
import com.example.fashionshop.repositories.CategoriesRepository;
import com.example.fashionshop.services.CategoriesService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {

        this.categoriesRepository = categoriesRepository;
    }

    @PostConstruct
    @Override
    public void fillKindsOfProducts() {
        if (categoriesRepository.count() == 0) {
            List<Categories> listOfKinds = new ArrayList<>();

            Categories womenKindOfProduct = new Categories();
            womenKindOfProduct.setCategoriesEnum(CategoriesEnum.ЖЕНИ);
            listOfKinds.add(womenKindOfProduct);

            Categories menKindOfProducts = new Categories();
            menKindOfProducts.setCategoriesEnum(CategoriesEnum.МЪЖЕ);
            listOfKinds.add(menKindOfProducts);

            Categories girlsKindOfProducts = new Categories();
            girlsKindOfProducts.setCategoriesEnum(CategoriesEnum.МОМИЧЕТА);
            listOfKinds.add(girlsKindOfProducts);

            Categories boysKindOfProduct = new Categories();
            boysKindOfProduct.setCategoriesEnum(CategoriesEnum.МОМЧЕТА);
            listOfKinds.add(boysKindOfProduct);

            categoriesRepository.saveAll(listOfKinds);
        }

    }

    @Override
    public List<Categories> getAllCategoriesNames() {

        return categoriesRepository.findAll();
    }

}
