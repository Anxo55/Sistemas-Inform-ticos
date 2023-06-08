package com.cebem.rickandmorty.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cebem.rickandmorty.Services.QuejaService;

@RestController
public class QuejaRestController {
    @Autowired
    QuejaService quejaService;

    @DeleteMapping("/quejas{id}")
    public String quejasDelete(@PathVariable String id) {
        boolean result = quejaService.deleteQueja(Long.parseLong(id));
        if(result) {
            return "Queja borrada";
        }else{
                return "ERROR al borrar la queja";
        }
        }
    }
    

