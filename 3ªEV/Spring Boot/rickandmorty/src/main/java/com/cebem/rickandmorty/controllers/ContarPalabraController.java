// package com.cebem.rickandmorty.controllers;

// import java.util.HashSet;
// import java.util.Set;

// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RestController

// public class ContarPalabraController {

//     // http://localhost:8080/contar?palabra=XXXX
//     @GetMapping("/contarPalabras")
//     public String muestraFormulario(){
//         return "formulario";
//     }


//     @GetMapping("contarPalabras") 
//     public String obtenerPalabra(@RequestParam("palabra1") String palabra1,
//                                 @RequestParam("palabra2") String palabra2,
//                                        Model model) {
//         Set<Character> coincidencias = checkNames(palabra1, palabra2);

//         model.addAttribute("totalCoincidencias", coincidencias.size());
//         model.addAttribute("letrasCoincidentes", coincidencias);

//         return "resultado";
//     }

//     private Set<Character> checkNames(String nombre1, String nombre2) {
//         String nombre1Lower = nombre1.toLowerCase();
//         String nombre2Lower = nombre2.toLowerCase();

//         Set<Character> contarPalabras = new HashSet<>();

//         for (char c : nombre1Lower.toCharArray()) {
//             if (nombre2Lower.contains(String.valueOf(c))) {
//                 contarPalabras.add(c);
//             }
//         }

//         return contarPalabras;
//     }
// }
    

