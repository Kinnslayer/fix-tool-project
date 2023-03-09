package com.rodrigo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.model.UserRegister;

@Repository
public interface UserRegisterRepository extends CrudRepository<UserRegister, String>{

    //Funções para aplicação do serviço
    boolean existsById(String loginId);
    boolean existsByName(String name);
    boolean existsByEmail(String email);
    boolean existsByPassword(String password);
    
    
    
    


}
