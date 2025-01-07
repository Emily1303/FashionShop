package com.example.fashionshop.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @NotNull
    @Size(min = 3, max = 30, message = "The first name must be between 3 and 30 symbols!")
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Size(min = 3, max = 30, message = "The last name must be between 3 and 30 symbols!")
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Email
    @Column(name = "email", unique = true)
    private String email;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Size(min = 10, max = 13, message = "The mobile phone must be between 10 and 13 symbols!")
    @Column(name = "mobile_phone")
    private String mobilePhone;

    @ManyToMany
    private List<Role> roles;

    @ManyToOne
    private DeliveryAddresses deliveryAddress;

    @NotNull
    @Column(name = "created_on")
    private LocalDateTime createdOn;

//    more columns to add: bought items too

    public User() {
        this.roles = new ArrayList<>();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setDeliveryAddress(DeliveryAddresses deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public DeliveryAddresses getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }
}
