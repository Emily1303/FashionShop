package com.example.fashionshop.models.entities;

import com.example.fashionshop.models.enums.RoleNamesEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @NotNull
    @Column(name = "role_name")
    @Enumerated(EnumType.STRING)
    private RoleNamesEnum roleName;

    public Role() {

    }

    public void setRoleName(RoleNamesEnum roleName) {
        this.roleName = roleName;
    }

    public RoleNamesEnum getRoleName() {
        return roleName;
    }
}
