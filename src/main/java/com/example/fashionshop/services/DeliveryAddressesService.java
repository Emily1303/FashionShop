package com.example.fashionshop.services;

import com.example.fashionshop.models.dtos.forLogic.AddDeliveryAddressDto;

import java.util.List;

public interface DeliveryAddressesService {

    void addDeliveryAddress(AddDeliveryAddressDto addDeliveryAddressDto);

    List<String> getCompanyNamesList();

}
