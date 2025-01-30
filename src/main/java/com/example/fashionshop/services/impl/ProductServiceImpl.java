package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.entities.Product;
import com.example.fashionshop.models.entities.ProductGroups;
import com.example.fashionshop.repositories.ProductRepository;
import com.example.fashionshop.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProductsForGroup(ProductGroups productGroup) {
        return productRepository.findByProductGroup(productGroup).get();
    }

}
