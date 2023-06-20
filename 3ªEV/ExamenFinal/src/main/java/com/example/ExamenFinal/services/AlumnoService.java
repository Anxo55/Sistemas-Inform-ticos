package com.example.ExamenFinal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamenFinal.models.AlumnoModel;
import com.example.ExamenFinal.repositories.AlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public void guardarAlumno(String nombre, int nota) {
        AlumnoModel alumno = new AlumnoModel(nombre, nota);
        alumnoRepository.save(alumno);
    }
}