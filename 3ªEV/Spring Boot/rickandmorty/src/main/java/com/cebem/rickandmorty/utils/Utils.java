package com.cebem.rickandmorty.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Utils {
    public static boolean isPalindrome(String word) {
        String inverseWord = new StringBuilder(word).reverse().toString();
        // String inverseWord = sb.reverse().toString();
        return inverseWord.equalsIgnoreCase(word);

    }

    public static void writeOnDisk(String fileName,String info) throws IOException{
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName, true);
            fw.write(info);
        }  finally{
            if(fw!=null) fw.close();

        }

    }

    public static boolean deleteFromDisk(String fileName) {
        File f = new File(fileName);
        return f.delete();
    }
    //SEGUNDO
    public static void emptyFile(String archivoPath) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(archivoPath));
        writer.print("");
        writer.close();
    }


    //TERCERO

    public static String readFromDisk(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName)); 
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line); 
            }
        } finally {
            if (br != null) {
                br.close(); 
            }
        }
        return sb.toString();
    }

    //CUARTO
    public class Numbers {
        private double num1;
        private double num2;
        private double num3;
    
        public double getNum1() {
            return num1;
        }
    
        public void setNum1(double num1) {
            this.num1 = num1;
        }
    
        public double getNum2() {
            return num2;
        }
    
        public void setNum2(double num2) {
            this.num2 = num2;
        }
    
        public double getNum3() {
            return num3;
        }
    
        public void setNum3(double num3) {
            this.num3 = num3;
        }
    }
    //QUINTO

    //SEXTO


}
