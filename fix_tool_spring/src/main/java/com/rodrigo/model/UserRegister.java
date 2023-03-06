package com.rodrigo.model;

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



}
