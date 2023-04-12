package com.cebem.rickandmorty.controllers;

import java.io.IOException;
import java.lang.ProcessHandle.Info;
import java.text.MessageFormat;
import java.util.Map;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cebem.rickandmorty.utils.Utils;

@RestController
public class rickController {
    @GetMapping("/")
    public String saluda() {
        return "Bienvenid@ a mi api rest de rickAndMorty";
    }

    @GetMapping("/random")
    public String random() {
        return Math.round(Math.random() * 10) + " ";
    }

    @GetMapping("/palindrome/{word}")
    public String palindrome(@PathVariable String word) {
        return Utils.isPalindrome(word) ? "Si es palíndromo" : "No es un palindromo";
    }

    @GetMapping("/add")
    public String add(@RequestParam String n1, @RequestParam String n2) {
        float resultado = Float.parseFloat(n1) + Float.parseFloat(n2);
        Object params[] = { n1, n2, resultado };
        return MessageFormat.format("la suma de {0} mas {1} es igual a {2}", params);
    }

    @PostMapping("/saveOnDisk")
    public String saveOnDisk(@RequestParam Map<String, String> body) {
        String name= body.get("name");
        String price= body.get("price");


        String info= name+" - "+ price+" \n";

        try {
            Utils.writeOnDisk("datos.txt", info);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            return "Error al intentar escribir en el fichero";
        }        

        return "Gracias por enviar el formulario, los datos se han guardado en el servidor";
    }

}
