package com.example.ExamenFinal.Utils;

public class Utils {

    public static String dniletter(int dni) {
    String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
    // int modulo = dni % 23;
    return String.valueOf(juegoCaracteres.charAt(dni % 23));
  }

    
}
