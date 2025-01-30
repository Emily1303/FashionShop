package com.example.fashionshop.models.entities;

import com.example.fashionshop.models.enums.BrandNamesEnum;
import com.example.fashionshop.models.enums.SizesEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

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
    @Size(max = 13, message = "The GTIN must be from 13 symbols!")
    @Column(name = "GTIN", unique = true)
    private String GTIN;

    @NotNull
    @Size(max = 6, message = "The code must be 6 symbols!")
    private String code;

    @NotNull
    @Size(min = 3, max = 20, message = "The color must be between 3 and 20 symbols!")
    @Column(name = "color")
    private String color;

    @ManyToOne
    private Categories category;

    @ManyToOne
    private ProductGroups productGroup;

    @NotNull
    @Column(name = "image_URL_one")
    private String imageUrlOne;

    @NotNull
    @Column(name = "image_URL_two")
    private String imageUrlTwo;

    @NotNull
    @Column(name = "description_of_the_product")
    private String descriptionOfTheProduct;

    @NotNull
    @Column(name = "care_and_ingredients")
    private String careAndIngredients;

    @Enumerated(EnumType.STRING)
    @Column(name = "size")
    private SizesEnum size;

    @NotNull
    @Positive
    @Column(name = "quantity_of_product")
    private Integer quantityOfProduct;

    @NotNull
    @Positive
    @Column(name = "price_in_BGN")
    private Double priceInBGN;

    @NotNull
    @Column(name = "for_sale")
    private Boolean forSale;

    @NotNull
    @Column(name = "discount_percentage")
    private Double discountPercentage;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getImageUrlOne() {
        return imageUrlOne;
    }

    public void setImageUrlOne(String imageUrlOne) {
        this.imageUrlOne = imageUrlOne;
    }

    public String getImageUrlTwo() {
        return imageUrlTwo;
    }

    public void setImageUrlTwo(String imageUrlTwo) {
        this.imageUrlTwo = imageUrlTwo;
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

    public SizesEnum getSize() {
        return size;
    }

    public void setSize(SizesEnum size) {
        this.size = size;
    }

    public Integer getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(Integer quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Double getPriceInBGN() {
        return priceInBGN;
    }

    public void setPriceInBGN(Double priceInBGN) {
        this.priceInBGN = priceInBGN;
    }

    public Boolean getForSale() {
        return forSale;
    }

    public void setForSale(Boolean forSale) {
        this.forSale = forSale;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

}
