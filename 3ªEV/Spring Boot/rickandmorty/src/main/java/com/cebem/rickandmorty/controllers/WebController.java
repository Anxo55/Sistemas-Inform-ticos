package com.cebem.rickandmorty.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cebem.rickandmorty.Services.RickAndMortyService;
import com.cebem.rickandmorty.models.CharactersModel;


@Controller
public class WebController {

    @Autowired
    RickAndMortyService rickAndMortyService;
    
    @RequestMapping("/rickandmorty/allTemplate")
    public String charactersTemplate(Model modelo) {
        CharactersModel charactersModel = rickAndMortyService.getAllCharacters();
        
        modelo.addAttribute("creator","Creado por Angel");
        modelo.addAttribute("characters", charactersModel.results);

        return "rickandmortyall";
    }

    //Queremos mostra en una pagina web el total de personajes que tenemos
    //Aparecerá la frase del TOTAL DE PERSONAJES : 867
    //Centrado en la pantalla y de color verde.
    //Usa un motor de pantallas (thymeleaf)
}
