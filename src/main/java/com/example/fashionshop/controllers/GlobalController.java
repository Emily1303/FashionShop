package com.example.fashionshop.controllers;

import com.example.fashionshop.models.enums.KindsOfProductsEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalController {

    @ModelAttribute("kindsEnum")
    public KindsOfProductsEnum[] kindsOfProducts() {
        return KindsOfProductsEnum.values();
    }

}
