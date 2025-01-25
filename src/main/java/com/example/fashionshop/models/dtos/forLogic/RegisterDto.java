package com.example.fashionshop.models.dtos.forLogic;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegisterDto(
        @NotNull
        @Size(min = 3, max = 30, message = "Името трябва да е между 3 и 30 символа!")
        String firstName,
        @NotNull
        @Size(min = 3, max = 30, message = "Фамилията трябва да е между 3 и 30 символа!")
        String lastName,
        @NotNull
        @Email
        String email,
        @NotNull
        @Size(min = 8, max = 15, message = "Паролата трябва да е между 8 и 15 символа!")
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
