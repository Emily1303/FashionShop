package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.dtos.forLogic.RegisterDto;
import com.example.fashionshop.models.entities.Admin;
import com.example.fashionshop.models.entities.User;
import com.example.fashionshop.models.enums.RoleNamesEnum;
import com.example.fashionshop.repositories.UserRepository;
import com.example.fashionshop.services.RoleService;
import com.example.fashionshop.services.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final RoleService roleService;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleService roleService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
    }

    @Override
    public void registerUser(RegisterDto registerDto) {
        User newUser = new User();

        newUser.setFirstName(registerDto.firstName());
        newUser.setLastName(registerDto.lastName());
        newUser.setEmail(registerDto.email());
        newUser.setPassword(registerDto.password());
    }


}
