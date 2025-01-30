package com.example.fashionshop.services;

import com.example.fashionshop.models.entities.ProductGroups;

import java.util.List;

public interface ProductGroupsService {

    void fillProductGroups();

    List<ProductGroups> getAllProductGroupsForWomenCategory();

    List<ProductGroups> getAllProductGroupsForMenCategory();

    List<ProductGroups> getAllProductGroupsForGirlsCategory();

    List<ProductGroups> getAllProductGroupsForBoysCategory();

    ProductGroups findProductGroupInListByName(List<ProductGroups> productGroups, String name);

}
