package com.example.fashionshop.models.dtos.forLogic;

import jakarta.validation.constraints.NotNull;

public record RegisterDto(
        @NotNull
        String firstName,
        @NotNull
        String lastName,
        @NotNull
        String email,
        @NotNull
        String password,
        @NotNull
        String confirmPassword,
        @NotNull
        String mobilePhone,
        @NotNull
        String deliveryCompanyName,
        @NotNull
        String deliveryOfficeName
) {

    public static RegisterDto construct() {
        return new RegisterDto(null, null, null, null,
                null, null, null, null);
    }
}
