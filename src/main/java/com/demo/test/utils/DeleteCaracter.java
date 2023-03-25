package com.demo.test.utils;

import java.util.ArrayList;
import java.util.List;

public class DeleteCaracter {


    public static List<Character> extraerPrimerCaracter(List<String> lista) {
        List<Character> caracteres = new ArrayList<Character>();
        for (String palabra : lista) {
            caracteres.add(palabra.charAt(0));
        }
        return caracteres;
    }
}
