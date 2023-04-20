package com.cebem.rickandmorty.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Utils {
    public static boolean isPalindrome(String word) {
        String inverseWord = new StringBuilder(word).reverse().toString();
        // String inverseWord = sb.reverse().toString();
        return inverseWord.equalsIgnoreCase(word);

    }

    public static void writeOnDisk(String fileName, String info) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName, true);
            fw.write(info);
        } finally {
            if (fw != null)
                fw.close();

        }

    }

    public static boolean deleteFromDisk(String fileName) {
        File f = new File("datos.txt");
        return f.delete();
    }

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

    public static void emptyFile(String File) throws IOException {
        PrintWriter w = new PrintWriter(new FileWriter(File));
        w.print("");
        w.close();
    }

    public static int getRandomValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue + 1);
    }
}
