package com.example.fashionshop.models.dtos.forLogic;

public record RegisterDto(
        String firstName,
        String lastName,
        String email,
        String password,
        String confirmPassword,
        String deliveryCompanyName,
        String deliveryOfficeName
) {

    public static RegisterDto construct() {
        return new RegisterDto(null, null, null, null,
                null, null, null);
    }
}
