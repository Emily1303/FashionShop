package com.example.fashionshop.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "product_groups")
public class ProductGroups extends BaseEntity {

    @NotNull
    @Column(name = "product_group_name")
    private String productGroupName;

    @ManyToMany
    private List<Categories> categories;

    public ProductGroups() {

    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

}
