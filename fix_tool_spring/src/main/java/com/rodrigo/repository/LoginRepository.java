package com.rodrigo.repository;

import org.springframework.data.repository.CrudRepository;

import com.rodrigo.model.Login;

public interface LoginRepository extends CrudRepository<Login, String> {
    
}
