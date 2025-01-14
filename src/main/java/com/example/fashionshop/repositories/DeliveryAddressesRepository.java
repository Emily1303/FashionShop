package com.example.fashionshop.repositories;

import com.example.fashionshop.models.entities.DeliveryAddresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeliveryAddressesRepository extends JpaRepository<DeliveryAddresses, Long> {


}
