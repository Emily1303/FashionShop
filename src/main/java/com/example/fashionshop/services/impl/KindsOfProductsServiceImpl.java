package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.entities.KindsOfProducts;
import com.example.fashionshop.models.enums.KindsOfProductsEnum;
import com.example.fashionshop.repositories.KindsOfProductsRepository;
import com.example.fashionshop.services.KindsOfProductsService;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class KindsOfProductsServiceImpl implements KindsOfProductsService {

    private final KindsOfProductsRepository kindsOfProductsRepository;

    public KindsOfProductsServiceImpl(KindsOfProductsRepository kindsOfProductsRepository) {

        this.kindsOfProductsRepository = kindsOfProductsRepository;
    }

    @PostConstruct
    @Override
    public void fillKindsOfProducts() {
        if (kindsOfProductsRepository.count() == 0) {
            List<KindsOfProducts> listOfKinds = new ArrayList<>();

            KindsOfProducts womenKindOfProduct = new KindsOfProducts();
            womenKindOfProduct.setKindsOfProductsName(KindsOfProductsEnum.ЖЕНИ);
            listOfKinds.add(womenKindOfProduct);

            KindsOfProducts menKindOfProducts = new KindsOfProducts();
            menKindOfProducts.setKindsOfProductsName(KindsOfProductsEnum.МЪЖЕ);
            listOfKinds.add(menKindOfProducts);

            KindsOfProducts girlsKindOfProducts = new KindsOfProducts();
            girlsKindOfProducts.setKindsOfProductsName(KindsOfProductsEnum.МОМИЧЕТА);
            listOfKinds.add(girlsKindOfProducts);

            KindsOfProducts boysKindOfProduct = new KindsOfProducts();
            boysKindOfProduct.setKindsOfProductsName(KindsOfProductsEnum.МОМЧЕТА);
            listOfKinds.add(boysKindOfProduct);

            kindsOfProductsRepository.saveAll(listOfKinds);
        }

    }

}
