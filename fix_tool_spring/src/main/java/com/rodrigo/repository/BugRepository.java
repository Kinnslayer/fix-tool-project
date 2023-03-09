package com.rodrigo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.model.Bug;

@Repository
public interface BugRepository extends CrudRepository<Bug, Long>{
    
}
