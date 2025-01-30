package com.example.fashionshop.models.dtos.forLogic;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record AddProductDto(
        @NotNull
        @Size(min = 3, max = 100, message = "Името на продукта трябва да е между 3 и 100 символа!")
        String productName,
        @NotNull
        String brandName,
        @NotNull
        @Size(max = 13, message = "Баркодът трябва да е 13 символа!")
        String gtin,
        @NotNull
        @Size(max = 6, message = "Вътрешният код трябва да е 6 символа!")
        String code,
        @NotNull
        String color,
        @NotNull
        String category,
        @NotNull
        String productGroup,
        @NotNull
        String imageUrlOne,
        @NotNull
        String imageUrlTwo,
        @NotNull
        String descriptionOfTheProduct,
        @NotNull
        String careAndIngredients,
        @NotNull
        String size,
        @NotNull
        @Positive
        Integer quantityOfTheProduct,
        @NotNull
        @Positive
        Double priceInBGN,
        @NotNull
        Boolean forSale,
        @NotNull
        Double discountPercentage
) {

    public static AddProductDto construct() {
        return new AddProductDto(null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null);
    }

}
