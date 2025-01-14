package com.example.fashionshop.services;

import com.example.fashionshop.models.entities.Role;
import com.example.fashionshop.models.enums.RoleNamesEnum;

public interface RoleService {

    void fillRoles();

    Role findRole(RoleNamesEnum name);

}
