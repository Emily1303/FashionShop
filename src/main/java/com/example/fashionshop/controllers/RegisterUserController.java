package com.example.fashionshop.controllers;

import com.example.fashionshop.models.dtos.forLogic.RegisterDto;
import com.example.fashionshop.repositories.DeliveryAddressesRepository;
import com.example.fashionshop.services.DeliveryAddressesService;
import com.example.fashionshop.services.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/register")
public class RegisterUserController {

    private final UserService userService;

    private final DeliveryAddressesService deliveryAddressesService;

    private final DeliveryAddressesRepository deliveryAddressesRepository;

    public RegisterUserController(UserService userService, DeliveryAddressesService deliveryAddressesService,
                                  DeliveryAddressesRepository deliveryAddressesRepository) {
        this.userService = userService;
        this.deliveryAddressesService = deliveryAddressesService;
        this.deliveryAddressesRepository = deliveryAddressesRepository;
    }

    @GetMapping
    public String registerUser(Model model) {
        RegisterDto registerDto = RegisterDto.construct();

        if(!model.containsAttribute("registerDto")) {
            model.addAttribute("registerDto", registerDto);
        }

        model.addAttribute("companies", deliveryAddressesRepository.findAllCompanyNames());

        return "register-user";
    }

    @PostMapping
    public String register(@Valid RegisterDto registerDto, BindingResult bindingResult,
                           RedirectAttributes rAttr) {

        if (bindingResult.hasErrors()) {
            rAttr.addFlashAttribute("registerDto", registerDto);
            rAttr.addFlashAttribute("org.springframework.validation.BindingResult.registerDto",
                    bindingResult);

            return "redirect:/register";
        }

        userService.registerUser(registerDto);

        return "redirect:/login";
    }
}
