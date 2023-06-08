package com.cebem.rickandmorty.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cebem.rickandmorty.models.QuejaModel;

@Repository
public interface QuejaRepository extends CrudRepository<QuejaModel, Long>{
    
    
}
