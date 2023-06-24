package com.example.ExamenFinalAnxo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExamenFinalAnxo.models.AlumnoModel;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel, Long>{
    List<AlumnoModel> findByName(String name);
    
}
