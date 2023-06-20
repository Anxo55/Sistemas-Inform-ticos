package com.example.ExamenFinal.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// http://localhost:8080/letradni/36335432 → D
@RequestMapping("/letradni")
public class DniController {

    @GetMapping("/{dni}")
    public String getDniLetter(@PathVariable String dni) {
        if (dni.matches("\\d{8}")) { // Validar que el DNI tenga 8 dígitos
            int dniNumber = Integer.parseInt(dni);
            String letter = calculateDniLetter(dniNumber);
            return letter;
        } else {
            return "Error: El número de DNI no es válido";
        }
    }

    private String calculateDniLetter(int dniNumber) {
        String[] letters = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int index = dniNumber % 23;
        return letters[index];
    }
}
