package com.cebem.rickandmorty.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cebem.rickandmorty.utils.Utils;

@RestController

public class examenController {



@GetMapping("/contar")
    public String mostrarFormulario() {
        return "formulario";
    }

    // http://localhost:8080/contar?nombre1=pepito&nombre2=Pepa
    @PostMapping("/contar")
    public String obtenerPalabras(@RequestParam("palabra") String palabra,
                                       @RequestParam("palabra2") String palabra2,
                                       Model model) {
        Set<Character> contar = checkNames(palabra, palabra2);

        model.addAttribute("totalCoincidencias", contar.size());
        model.addAttribute("letrasCoincidentes", contar);

        return "resultado";
    }

    private Set<Character> checkNames(String palabra, String palabra2) {
        String palabraLower = palabra.toLowerCase();
        String palabra2Lower = palabra2.toLowerCase();

        Set<Character> coincidencias = new HashSet<>();

        for (char c : palabraLower.toCharArray()) {
            if (palabra2Lower.contains(String.valueOf(c))) {
                coincidencias.add(c);
            }
        }

        return coincidencias;
    }

    
}

    

