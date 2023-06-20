package com.example.ExamenFinal.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoincidenciasController {

    // http://localhost:8080/coincidencias?nombre1=XXXX&nombre2=YYYY
    @GetMapping("/coincidencias")
    public String obtenerCoincidencias(@RequestParam("nombre1") String nombre1, @RequestParam("nombre2") String nombre2) {
        int coincidencias = contarCoincidencias(nombre1, nombre2);
        return String.valueOf(coincidencias);
    }

    private int contarCoincidencias(String nombre1, String nombre2) {
        String nombre1Lower = nombre1.toLowerCase();
        String nombre2Lower = nombre2.toLowerCase();
        int coincidencias = 0;

        for (char c : nombre1Lower.toCharArray()) {
            if (nombre2Lower.contains(String.valueOf(c))) {
                coincidencias++;
            }
        }

        return coincidencias;
    }
}