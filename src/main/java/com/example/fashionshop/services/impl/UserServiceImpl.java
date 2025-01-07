package com.example.fashionshop.services.impl;

import com.example.fashionshop.repositories.UserRepository;
import com.example.fashionshop.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
