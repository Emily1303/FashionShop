package com.example.fashionshop.models.entities;

import com.example.fashionshop.models.enums.CategoriesEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "categories")
public class Categories extends BaseEntity {

    @NotNull
    @Column(name = "categories_name")
    @Enumerated(EnumType.STRING)
    private CategoriesEnum categoriesEnum;

    public Categories() {

    }

    public CategoriesEnum getCategoriesEnum() {
        return categoriesEnum;
    }

    public void setCategoriesEnum(CategoriesEnum categoriesEnum) {
        this.categoriesEnum = categoriesEnum;
    }

}
