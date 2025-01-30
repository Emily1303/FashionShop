package com.example.fashionshop.repositories;

import com.example.fashionshop.models.entities.Product;
import com.example.fashionshop.models.entities.ProductGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<List<Product>> findByProductGroup(ProductGroups productGroups);

}
