package com.example.fashionshop.repositories;

import com.example.fashionshop.models.entities.KindsOfProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KindsOfProductsRepository extends JpaRepository<KindsOfProducts, Long> {
}
