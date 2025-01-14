package com.example.fashionshop.models.entities;

import com.example.fashionshop.models.enums.DeliveryCompanyNamesEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "delivery_addresses")
public class DeliveryAddresses extends BaseEntity {

    @NotNull
    @Column(name = "company_name")
    @Enumerated(EnumType.STRING)
    private DeliveryCompanyNamesEnum companyName;

    @NotNull
    @Size(min = 3, max = 50, message = "The office name must be between 3 and 50 symbols!")
    @Column(name = "office_name", unique = true)
    private String officeName;

    @NotNull
    @Size(min = 3, max = 100, message = "The address must be between 3 and 100 symbols!")
    @Column(name = "address")
    private String address;

    @NotNull
    @Positive
    @Column(name = "tax_of_delivery_company")
    private double taxOfDeliveryCompany;

//    @OneToMany
//    private List<User> usersList;

    public DeliveryAddresses() {
//        this.usersList = new ArrayList<>();
    }

    public void setCompanyName(DeliveryCompanyNamesEnum companyName) {
        this.companyName = companyName;
    }

    public DeliveryCompanyNamesEnum getCompanyName() {
        return companyName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCashOnDeliveryTax(double cashOnDeliveryTax) {
        this.taxOfDeliveryCompany = cashOnDeliveryTax;
    }

    public double getCashOnDeliveryTax() {
        return taxOfDeliveryCompany;
    }

//    public void setUsersList(List<User> usersList) {
//        this.usersList = usersList;
//    }
//
//    public List<User> getUsersList() {
//        return usersList;
//    }
}
