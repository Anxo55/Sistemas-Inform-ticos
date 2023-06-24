//  package com.example.ExamenFinalAnxo.Controllers;

//  import org.springframework.beans.factory.annotation.Autowired;
//  import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
//  import com.example.ExamenFinalAnxo.models.ChicaModel;
//  import com.example.ExamenFinalAnxo.services.ChicaService;

//  @RestController
//  public class ChicaController {

//      @Autowired
//      ChicaService chicaService;

//      @GetMapping("/girl/random")
//      public String randomGirl() {

//         ChicaModel chicaModel = chicaService.getRandomGirl();
//         String locationName = chicaModel.location.name();

//         return chicaModel.name + "</br>" + "<img width='200' src='"+chicaModel.image+"'/>" + "</br>"+ locationName;
//      }

//      @GetMapping("/girl")
//      public String girls(@RequestParam int id) {
//         ChicaModel chicaModel = chicaService.getGirl(id);
//         String locationName = chicaModel.location.name();
//         return chicaModel.name + "<br/>" + "<img width='200' src='"+chicaModel.image+"'/>" + "</br>"+ locationName;
//      }
     
    
//  }