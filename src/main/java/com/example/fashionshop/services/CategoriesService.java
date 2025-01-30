package com.example.fashionshop.services;

import com.example.fashionshop.models.entities.Categories;

import java.util.List;

public interface CategoriesService {

    void fillKindsOfProducts();

    List<Categories> getAllCategoriesNames();

}
