package com.example.ExamenFinal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExamenFinal.models.QuejaModel;

@Repository
public interface QuejaRepository extends JpaRepository<QuejaModel, Long> {
    List<QuejaModel> findByName(String name);
}
