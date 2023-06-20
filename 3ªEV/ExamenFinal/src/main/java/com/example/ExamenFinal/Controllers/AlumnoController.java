package com.example.ExamenFinal.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExamenFinal.models.AlumnoModel;
import com.example.ExamenFinal.repositories.AlumnoRepository;
import com.example.ExamenFinal.services.AlumnoService;

@RestController
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("/alumnos")
    public ResponseEntity<?> guardarAlumno(@RequestParam String nombre, @RequestParam int nota) {
        alumnoService.guardarAlumno(nombre, nota);
        return ResponseEntity.ok().build();
    }
}