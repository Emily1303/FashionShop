package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.entities.Role;
import com.example.fashionshop.models.enums.RoleNamesEnum;
import com.example.fashionshop.repositories.RoleRepository;
import com.example.fashionshop.services.RoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    @Override
    public void fillRoles() {
        if (roleRepository.count() == 0) {
            List<Role> listRoles = new ArrayList<>();

            Role roleAdmin = new Role();
            roleAdmin.setRoleName(RoleNamesEnum.ADMIN);
            listRoles.add(roleAdmin);

            Role roleUser = new Role();
            roleUser.setRoleName(RoleNamesEnum.USER);
            listRoles.add(roleUser);

            roleRepository.saveAll(listRoles);
        }

    }

    @Override
    public Role findRole(RoleNamesEnum name) {
        return roleRepository.findByRoleName(name).get();
    }
}
