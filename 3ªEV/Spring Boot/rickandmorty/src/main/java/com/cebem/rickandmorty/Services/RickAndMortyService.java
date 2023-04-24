package com.cebem.rickandmorty.Services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cebem.rickandmorty.models.CharacterModel;
import com.cebem.rickandmorty.models.CharactersModel;
import com.cebem.rickandmorty.utils.Utils;

@Service
public class RickAndMortyService {
    @Autowired
    RestTemplate restTemplate;

    public CharacterModel getCharacterRandom(){
        final int TOTAL_CHARACTERS = 826;
        int random= Utils.getRandomValue(TOTAL_CHARACTERS-1)+1;   //1..826
        String url= "https://rickandmortyapi.com/api/character/"+random;
        
        //RestTemplate restTEmplate = new RestTemplate();
        CharacterModel datos  = restTemplate.getForObject(url, CharacterModel.class);
        return datos;

    }

    public CharactersModel getAllCharacters() {
        String url= "https://rickandmortyapi.com/api/character/";
        CharactersModel datos = restTemplate.getForObject(url, CharactersModel.class);
        return datos;

    }

}
