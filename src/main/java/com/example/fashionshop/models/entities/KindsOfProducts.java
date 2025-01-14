package com.example.fashionshop.models.entities;

import com.example.fashionshop.models.enums.KindsOfProductsEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "kinds_of_products")
public class KindsOfProducts extends BaseEntity {

    @NotNull
    @Column(name = "kinds_of_products_name")
    @Enumerated(EnumType.STRING)
    private KindsOfProductsEnum kindsOfProductsName;

    public KindsOfProducts() {

    }

    public void setKindsOfProductsName(KindsOfProductsEnum kindsOfProductsName) {
        this.kindsOfProductsName = kindsOfProductsName;
    }

    public KindsOfProductsEnum getKindsOfProductsName() {
        return kindsOfProductsName;
    }

}
