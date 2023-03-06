package com.rodrigo.repository;

import org.springframework.data.repository.CrudRepository;

import com.rodrigo.model.UserRegister;

public interface UserRegisterRepository extends CrudRepository<UserRegister, String>{
    
}
