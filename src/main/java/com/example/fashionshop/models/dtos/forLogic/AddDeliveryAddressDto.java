package com.example.fashionshop.models.dtos.forLogic;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AddDeliveryAddressDto(
        @NotNull
        String companyName,
        @NotNull
        @Size(min = 3, max = 50, message = "Името на офиса трябва да е между 3 и 50 символа!")
        String officeName,
        @NotNull
        @Size(min = 3, max = 100, message = "Адресът трябва да е между 3 и 100 символа!")
        String address) {

    public static AddDeliveryAddressDto construct() {
        return new AddDeliveryAddressDto(null, null, null);

    }
}
