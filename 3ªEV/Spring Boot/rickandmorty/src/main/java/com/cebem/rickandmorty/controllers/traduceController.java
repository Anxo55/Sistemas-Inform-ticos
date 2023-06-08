// package com.cebem.rickandmorty.controllers;

// import java.io.IOException;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

// import com.cebem.rickandmorty.Services.traduceService;
// import com.cebem.rickandmorty.models.TraduceModel;
// import com.fasterxml.jackson.databind.JsonNode;
// import com.fasterxml.jackson.databind.ObjectMapper;

// @RestController
// public class traduceController {
    
//     @GetMapping("/traduce/frase")
//     public String translate(){
//        //RickAndMortyService rickAndMortyService = new RickAndMortyService();
//        TraduceModel traduceModel = traduceService.getTranslate();
 
//        return traduceModel.name;
//     }
// }