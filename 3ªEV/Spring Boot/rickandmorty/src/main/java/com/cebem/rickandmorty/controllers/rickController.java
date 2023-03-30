package com.cebem.rickandmorty.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rickController {
    // http://127.0.0.1/saluda
    // http://localhost/saluda
    // http://anxo.com/saluda
    @GetMapping("/saluda")
    public String saluda() {
        return "Bienvenid@ a mi api rest de rickAndMorty";
    }

    @GetMapping("/random")
    public String random() {
        return Math.round(Math.random()*10) + "";
    }
    
}
