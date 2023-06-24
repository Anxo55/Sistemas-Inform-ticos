//  package com.example.ExamenFinalAnxo.services;

//  import org.springframework.beans.factory.annotation.Autowired;
//  import org.springframework.stereotype.Service;
// //  import org.springframework.web.client.RestTemplate;

//  import com.example.ExamenFinalAnxo.Utils.Utils;
//  import com.example.ExamenFinalAnxo.models.ChicaModel;
//  import org.springframework.web.client.RestTemplate;

//  @Service
//  public class ChicaService {

//      @Autowired
//      RestTemplate restTemplate;

//    final static String BASE_API = "https://randomuser.me/";

//     final int TOTAL_CHARACTERS = 826;

//      public ChicaModel getRandomGirl() {
        
//          int random = Utils.getRandomValue(TOTAL_CHARACTERS-1)+1;
//          String url = "/girls/"+random;
//          ChicaModel datos = restTemplate.getForObject(BASE_API+url,ChicaModel.class);
//          return datos;
//      }

//      public ChicaModel getGirl(int num) {
//         String url = "/girls" + num;
//         ChicaModel datos = restTemplate.getForObject(BASE_API+url,ChicaModel.class);
//         return datos;
//         }

    
//  }
