package com.example.fashionshop.controllers;

import com.example.fashionshop.models.enums.DeliveryCompanyNamesEnum;
import com.example.fashionshop.repositories.DeliveryAddressesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CompanyOfficeController {

    private final DeliveryAddressesRepository deliveryAddressesRepository;

    public CompanyOfficeController(DeliveryAddressesRepository deliveryAddressesRepository) {
        this.deliveryAddressesRepository = deliveryAddressesRepository;
    }

    @GetMapping("/companies/{deliveryCompanyName}/offices")
    public List<String> getOfficesByCompany(@PathVariable("deliveryCompanyName") String companyName) {
        DeliveryCompanyNamesEnum companyNameEnum = DeliveryCompanyNamesEnum.valueOf(companyName);
        return deliveryAddressesRepository.findOfficesByCompanyName(companyNameEnum);
    }
}
