package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.dtos.forLogic.RegisterDto;
import com.example.fashionshop.models.entities.DeliveryAddresses;
import com.example.fashionshop.models.entities.User;
import com.example.fashionshop.models.enums.RoleNamesEnum;
import com.example.fashionshop.repositories.DeliveryAddressesRepository;
import com.example.fashionshop.repositories.RoleRepository;
import com.example.fashionshop.repositories.UserRepository;
import com.example.fashionshop.services.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final RoleRepository roleRepository;

    private final DeliveryAddressesRepository deliveryAddressesRepository;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleRepository roleRepository,
                           DeliveryAddressesRepository deliveryAddressesRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
        this.deliveryAddressesRepository = deliveryAddressesRepository;
    }

    @Override
    public void registerUser(RegisterDto registerDto) {
        User newUser = new User();

        newUser.setFirstName(registerDto.firstName());
        newUser.setLastName(registerDto.lastName());
        newUser.setEmail(registerDto.email());
        newUser.setPassword(passwordEncoder.encode(registerDto.password()));
        newUser.setMobilePhone(registerDto.mobilePhone());
        DeliveryAddresses deliveryAddress = deliveryAddressesRepository.findByOfficeName(registerDto.deliveryOfficeName()).get();
        newUser.setDeliveryAddress(deliveryAddress);
        newUser.setRole(roleRepository.findByRoleName(RoleNamesEnum.USER).get());
        newUser.setCreatedOn(LocalDateTime.now());

        userRepository.save(newUser);
    }


}
