package com.example.fashionshop.models.entities;

import com.example.fashionshop.models.enums.BrandNamesEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigInteger;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {

    @NotNull
    @Column(name = "product_name")
    private String productName;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "brand_name")
    private BrandNamesEnum brandName;

    @NotNull
    @Size(min = 3, max = 13, message = "The GTIN must be from 13 symbols!")
    @Column(name = "GTIN", unique = true)
    private String GTIN;

    @NotNull
    @Size(min = 3, max = 20, message = "The color must be between 3 and 20 symbols!")
    @Column(name = "color")
    private String color;

    @ManyToOne
    private Categories category;

    @ManyToOne
    private ProductGroups productGroup;

    @NotNull
    @Column(name = "image")
    private String image;

    @NotNull
    @Column(name = "description_of_the_product")
    private String descriptionOfTheProduct;

    @NotNull
    @Column(name = "care_and_ingredients")
    private String careAndIngredients;

    @NotNull
    @Size(min = 1, max = 6, message = "The size must be between 1 and 6 symbols!")
    @Column(name = "size")
    private String size;

    @NotNull
    @Positive
    @Column(name = "price_in_BGN")
    private BigInteger priceInBGN;

    public Product() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BrandNamesEnum getBrandName() {
        return brandName;
    }

    public void setBrandName(BrandNamesEnum brandName) {
        this.brandName = brandName;
    }

    public String getGTIN() {
        return GTIN;
    }

    public void setGTIN(String GTIN) {
        this.GTIN = GTIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public ProductGroups getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroups productGroup) {
        this.productGroup = productGroup;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescriptionOfTheProduct() {
        return descriptionOfTheProduct;
    }

    public void setDescriptionOfTheProduct(String descriptionOfTheProduct) {
        this.descriptionOfTheProduct = descriptionOfTheProduct;
    }

    public String getCareAndIngredients() {
        return careAndIngredients;
    }

    public void setCareAndIngredients(String careAndIngredients) {
        this.careAndIngredients = careAndIngredients;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigInteger getPriceInBGN() {
        return priceInBGN;
    }

    public void setPriceInBGN(BigInteger priceInBGN) {
        this.priceInBGN = priceInBGN;
    }

}
