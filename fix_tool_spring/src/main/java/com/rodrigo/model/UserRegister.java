package com.rodrigo.model;

import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "register_user")
@Data
public class UserRegister {

    @Id
    private String loginId;

    private String password;

    private String name;
    
    private String email;


    public static Optional<UserRegister> findById(String loginId2) {
        return null;
    }





}
