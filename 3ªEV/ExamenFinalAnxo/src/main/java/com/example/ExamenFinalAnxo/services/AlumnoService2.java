package com.example.ExamenFinalAnxo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamenFinalAnxo.models.AlumnoModel;
import com.example.ExamenFinalAnxo.repositories.AlumnoRepository;

@Service
public class AlumnoService2 {
    @Autowired
    AlumnoRepository alumnoRepository;

    public AlumnoModel create(AlumnoModel alumno) {
        return alumnoRepository.save(alumno);
    }

    public ArrayList<AlumnoModel>getAll() {
        return (ArrayList<AlumnoModel>) alumnoRepository.findAll();
    }

    public ArrayList<AlumnoModel> getByName(String name) {
        return (ArrayList<AlumnoModel>) alumnoRepository.findByName(name);
    }
    
}
