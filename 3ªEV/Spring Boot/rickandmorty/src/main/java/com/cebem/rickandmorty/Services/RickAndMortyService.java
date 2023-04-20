package com.cebem.rickandmorty.Services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cebem.rickandmorty.utils.Utils;

@Service
public class RickAndMortyService {
    @Autowired
    RestTemplate restTemplate;

    public void getCharacterRandom(){
    final int TOTAL_CHARACTERS = 826;
    int random= Utils.getRandomValue(TOTAL_CHARACTERS-1)+1; 
    String url= "https://rickandmortyapi.com/api/character/"+random;

  
    respuesta= restTemplate.getForObject(url);
}
}
