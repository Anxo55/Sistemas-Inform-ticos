package com.example.ExamenFinal.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ExamenFinal.models.TranslationModel;

import org.springframework.boot.web.client.RestTemplateBuilder;

@Service
public class TraductionService {
    private final RestTemplate restTemplate;

    public TraductionService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String translate(String frase){
        final String url = "https://api.mymemory.translated.net/get?q="+frase+"&langpair=en|es";
        TranslationModel datos = restTemplate.getForObject(url, TranslationModel.class);
        return datos.responseData.translatedText;
    }
}
