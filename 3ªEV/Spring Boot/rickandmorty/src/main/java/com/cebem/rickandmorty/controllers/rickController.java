package com.cebem.rickandmorty.controllers;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessHandle.Info;
import java.text.MessageFormat;
import java.util.Map;
import java.util.Random;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cebem.rickandmorty.utils.Utils;

import ch.qos.logback.classic.pattern.Util;

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
        String name = body.get("name");
        String price = body.get("price");

        String info = name + " - " + price + " \n";

        try {
            Utils.writeOnDisk("datos.txt", info);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            return "Error al intentar escribir en el fichero";
        }

        return "Gracias por enviar el formulario, los datos se han guardado en el servidor";
    }
@CrossOrigin(origins = "*")
    @DeleteMapping("/removeFromDisk")
    public String removeFromDisk() {
        boolean resultado = Utils.deleteFromDisk("datos.txt");
        return resultado ? "Borrado correctamente" : " No he podido eliminar el archivo";
    }


    @GetMapping("/mayor")
    public String mayor(@RequestParam String num1, @RequestParam String num2, @RequestParam String num3) {
        try {
            float numero1 = Float.parseFloat(num1);
            float numero2 = Float.parseFloat(num2);
            float numero3 = Float.parseFloat(num3);

            // Comparar los números para encontrar el mayor
            float mayor = numero1;
            if (numero2 > mayor) {
                mayor = numero2;
            }
            if (numero3 > mayor) {
                mayor = numero3;
            }

            return "El mayor número es: " + mayor;

        } catch (NumberFormatException e) {
            return "ERROR: Alguno de los elementos no es un número válido";
        }
    }

    @GetMapping("/capitalize")
    public String capitalize(@RequestParam String frase) {
        String[] palabras = frase.split("\\s+");
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                String primeraLetra = palabra.substring(0, 1).toUpperCase();
                String restoPalabra = palabra.substring(1).toLowerCase();
                resultado.append(primeraLetra).append(restoPalabra).append(" ");
            }
        }
        return resultado.toString().trim();
    }

    @GetMapping("/getInfo")
    public String getInfo() {
        try {
            String informacion = Utils.readFromDisk("datos.txt");
            return informacion;
        } catch (IOException e) {
            return "Error al intentar leer el archivo";
        }
    }

    @DeleteMapping("/emptyFile")
    public String emptyFile() {
        try {
            Utils.emptyFile("datos.txt");
        } catch (IOException e) {
            return "Error al intentar vaciar el fichero";
        }
        return "El fichero ha sido vaciado correctamente";
    }

    @RequestMapping("/vaciarFile")
    public String vaciarFile() {
        try {
            Utils.writeOnDisk("datos.txt", "");
        } catch (IOException e) {
            return "Error al intentar vaciar el fichero";
        }
        return "El fichero ha sido vaciado correctamente";
    }

    @GetMapping("/randomColors")
    public String[] randomColors() {
        String[] coloresBasicos = { "negro", "azul", "marrón", "gris", "verde", "naranja", "rosa", "púrpura", "rojo",
                "blanco", "amarillo" };
        String[] coloresAleatorios = new String[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int indiceAleatorio;
            do {
                indiceAleatorio = random.nextInt(coloresBasicos.length);
            } while (contains(coloresAleatorios, coloresBasicos[indiceAleatorio]));

            coloresAleatorios[i] = coloresBasicos[indiceAleatorio];
        }

        return coloresAleatorios;
    }

    private boolean contains(String[] array, String value) {
        for (String item : array) {
            if (item != null && item.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @GetMapping("/rickandmorty/random")
    public static String randomCharacter(){
        return "";
    }
}
