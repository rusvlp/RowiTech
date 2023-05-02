package com.hack.rowitech.entities;

import com.hack.rowitech.enums.Role;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User extends BaseEntity{
    @Id
    @Column(name = "user_id")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "secured_data")
    private String securedData;
    //TODO: Разобраться с ролями
    /*@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();*/
}
