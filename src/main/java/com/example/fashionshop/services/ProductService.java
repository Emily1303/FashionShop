package com.example.fashionshop.services;

import com.example.fashionshop.models.entities.Product;
import com.example.fashionshop.models.entities.ProductGroups;

import java.util.List;

public interface ProductService {

    List<Product> getAllProductsForGroup(ProductGroups productGroup);

}
