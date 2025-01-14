package com.example.fashionshop.controllers;

import com.example.fashionshop.models.dtos.forLogic.RegisterDto;
import com.example.fashionshop.services.UserService;
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

    public RegisterUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String registerUser(Model model) {

        if(!model.containsAttribute("registerDto")) {
            model.addAttribute("registerDto", RegisterDto.construct());
        }

        return "register-user";
    }

    @PostMapping
    public String register(RegisterDto registerDto, BindingResult bindingResult,
                           RedirectAttributes rAttr) {

        if (bindingResult.hasErrors()) {
            rAttr.addFlashAttribute("registerDto", registerDto);
            rAttr.addFlashAttribute("org.springframework.validation.BindingResult.registerDto",
                    bindingResult);

            return "redirect:/register";
        }

//        if there is not an error in the data in inputs -> a method for register user is needed

        return "redirect:/login";
    }
}
