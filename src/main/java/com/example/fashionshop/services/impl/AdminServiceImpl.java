package com.example.fashionshop.services.impl;

import com.example.fashionshop.models.entities.Admin;
import com.example.fashionshop.models.enums.RoleNamesEnum;
import com.example.fashionshop.repositories.AdminRepository;
import com.example.fashionshop.services.AdminService;
import com.example.fashionshop.services.RoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final PasswordEncoder passwordEncoder;

    private final AdminRepository adminRepository;

    private final RoleService roleService;

    public AdminServiceImpl(PasswordEncoder passwordEncoder, AdminRepository adminRepository, RoleService roleService) {
        this.passwordEncoder = passwordEncoder;
        this.adminRepository = adminRepository;
        this.roleService = roleService;
    }

    @PostConstruct
    @Override
    public void fillAllAdmins() {
        if (adminRepository.count() == 0) {
            List<Admin> adminsList = new ArrayList<>();

            Admin firstAdmin = new Admin();
            firstAdmin.setFirstName("Emily");
            firstAdmin.setLastName("Filipova");
            firstAdmin.setEmail("e.filipova3331@elliem.com");
            firstAdmin.setPassword(passwordEncoder.encode("E1303i"));
            firstAdmin.setMobilePhone("+359888234679");
            firstAdmin.setCreatedOn(LocalDateTime.now());
            firstAdmin.setRole(roleService.findRole(RoleNamesEnum.ADMIN));
            adminsList.add(firstAdmin);

            Admin thirdAdmin = new Admin();
            thirdAdmin.setFirstName("Svetoslava");
            thirdAdmin.setLastName("Filipova");
            thirdAdmin.setEmail("svety.filipova@elliem.com");
            thirdAdmin.setPassword(passwordEncoder.encode("S2102y"));
            thirdAdmin.setMobilePhone("+359888765943");
            thirdAdmin.setCreatedOn(LocalDateTime.now());
            thirdAdmin.setRole(roleService.findRole(RoleNamesEnum.ADMIN));
            adminsList.add(thirdAdmin);

            Admin secondAdmin = new Admin();
            secondAdmin.setFirstName("Simeon");
            secondAdmin.setLastName("Dimitrov");
            secondAdmin.setEmail("simo.dimitrov9@elliem.com");
            secondAdmin.setPassword(passwordEncoder.encode("S0905o"));
            secondAdmin.setMobilePhone("+359889769543");
            secondAdmin.setCreatedOn(LocalDateTime.now());
            secondAdmin.setRole(roleService.findRole(RoleNamesEnum.ADMIN));
            adminsList.add(secondAdmin);

            adminRepository.saveAll(adminsList);
        }

    }
}
