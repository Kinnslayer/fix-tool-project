package com.rodrigo.repository;

import org.springframework.data.repository.CrudRepository;

import com.rodrigo.model.Bug;

public interface BugRepository extends CrudRepository<Bug, Long>{
    
}
