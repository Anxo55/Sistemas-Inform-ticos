package com.cebem.rickandmorty.utils;

import java.io.FileWriter;
import java.io.IOException;

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
}
