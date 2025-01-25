package com.example.fashionshop.repositories;

import com.example.fashionshop.models.entities.Categories;
import com.example.fashionshop.models.entities.ProductGroups;
import com.example.fashionshop.models.enums.CategoriesEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductGroupsRepository extends JpaRepository<ProductGroups, Long> {

    Optional<List<ProductGroups>> findByCategories(Categories category);

}
