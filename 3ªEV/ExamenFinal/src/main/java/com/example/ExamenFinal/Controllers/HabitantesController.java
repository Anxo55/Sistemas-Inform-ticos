package com.example.ExamenFinal.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ExamenFinal.models.GeoLocationResponse;

@RestController
public class HabitantesController {

    // http://localhost:8080/habitantes/Vigo
    @GetMapping("/habitantes/{lugar}")
    public String obtenerHabitantes(@PathVariable("lugar") String lugar) {
        String endpoint = "https://geocoding-api.open-meteo.com/v1/search?name=" + lugar;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GeoLocationResponse[]> response = restTemplate.getForEntity(endpoint, GeoLocationResponse[].class);

        if (response.getBody() != null && response.getBody().length > 0) {
            GeoLocationResponse geoLocation = response.getBody()[0];
            return String.valueOf(geoLocation.getPopulation());
        } else {
            return "No se encontró información de habitantes para " + lugar;
        }
    }
}