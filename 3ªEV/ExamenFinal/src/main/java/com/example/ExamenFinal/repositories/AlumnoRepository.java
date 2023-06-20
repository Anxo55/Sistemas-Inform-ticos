package com.example.ExamenFinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExamenFinal.models.AlumnoModel;

public interface AlumnoRepository extends JpaRepository<AlumnoModel, Long> {
}
