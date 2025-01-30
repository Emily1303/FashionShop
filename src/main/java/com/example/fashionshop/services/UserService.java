package com.example.fashionshop.services;

import com.example.fashionshop.models.dtos.forLogic.RegisterDto;
import com.example.fashionshop.models.entities.Categories;

import java.util.List;

public interface UserService {

    void registerUser(RegisterDto registerDto);

}
