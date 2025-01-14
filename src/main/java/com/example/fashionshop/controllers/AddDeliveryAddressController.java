package com.example.fashionshop.controllers;

import com.example.fashionshop.models.dtos.forLogic.AddDeliveryAddressDto;
import com.example.fashionshop.services.DeliveryAddressesService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/add-delivery-address")
public class AddDeliveryAddressController {

    private final DeliveryAddressesService deliveryAddressesService;

    public AddDeliveryAddressController(DeliveryAddressesService deliveryAddressesService) {
        this.deliveryAddressesService = deliveryAddressesService;
    }

    @GetMapping
    public String addDeliveryAddress(Model model) {
        if (!model.containsAttribute("addDeliveryAddressDto")) {
            model.addAttribute("addDeliveryAddressDto", AddDeliveryAddressDto.construct());
        }

        if (!model.containsAttribute("companyNamesList")) {
            model.addAttribute("companyNamesList", deliveryAddressesService.getCompanyNamesList());
        }

        return "add-delivery-address";
    }

    @PostMapping
    public String addDeliveryAddress(@Valid AddDeliveryAddressDto addDeliveryAddressDto, BindingResult bindingResult,
                                     RedirectAttributes rAttr) {

        if (bindingResult.hasErrors()) {
            rAttr.addFlashAttribute("addDeliveryAddressDto", addDeliveryAddressDto);
            rAttr.addFlashAttribute("org.springframework.validation.BindingResult.addDeliveryAddressDto",
                    bindingResult);

            return "redirect:/add-delivery-address";
        }

        deliveryAddressesService.addDeliveryAddress(addDeliveryAddressDto);

        return "redirect:/home";
    }

}
