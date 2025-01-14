package com.example.fashionshop.repositories;

import com.example.fashionshop.models.entities.Role;
import com.example.fashionshop.models.enums.RoleNamesEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(RoleNamesEnum name);
}
