package com.rodrigo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.model.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, String> {
    
}
