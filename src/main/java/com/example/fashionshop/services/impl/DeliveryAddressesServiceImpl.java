package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.dtos.forLogic.AddDeliveryAddressDto;
import com.example.fashionshop.models.entities.DeliveryAddresses;
import com.example.fashionshop.models.enums.DeliveryCompanyNamesEnum;
import com.example.fashionshop.repositories.DeliveryAddressesRepository;
import com.example.fashionshop.services.DeliveryAddressesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeliveryAddressesServiceImpl implements DeliveryAddressesService {

    private final DeliveryAddressesRepository deliveryAddressesRepository;

    public DeliveryAddressesServiceImpl(DeliveryAddressesRepository deliveryAddressesRepository) {
        this.deliveryAddressesRepository = deliveryAddressesRepository;
    }

    public List<String> getCompanyNamesList() {

        List<String> companyNames = new ArrayList<>();
        companyNames.add(DeliveryCompanyNamesEnum.ECONT.name());
        companyNames.add(DeliveryCompanyNamesEnum.SPEEDY.name());

        return companyNames;
    }

    @Override
    public void addDeliveryAddress(AddDeliveryAddressDto addDeliveryAddressDto) {
        DeliveryAddresses newDeliveryAddress = new DeliveryAddresses();

        if (addDeliveryAddressDto.companyName().equals("ECONT")) {
            newDeliveryAddress.setCompanyName(DeliveryCompanyNamesEnum.ECONT);
            newDeliveryAddress.setCashOnDeliveryTax(6.00);
        } else if (addDeliveryAddressDto.companyName().equals("SPEEDY")) {
            newDeliveryAddress.setCompanyName(DeliveryCompanyNamesEnum.SPEEDY);
            newDeliveryAddress.setCashOnDeliveryTax(5.00);
        }

        newDeliveryAddress.setOfficeName(addDeliveryAddressDto.officeName());
        newDeliveryAddress.setAddress(addDeliveryAddressDto.address());

        deliveryAddressesRepository.save(newDeliveryAddress);
    }
}
