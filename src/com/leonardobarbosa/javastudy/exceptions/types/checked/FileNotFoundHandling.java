package com.leonardobarbosa.javastudy.exceptions.types.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundHandling {
    public static void main(String[] args) {

        /*
        Objetivo: Tratar exception específica
        Prefira Exceptions específicas ao invés de genéricas (Exception e)
         */

        try {
            FileReader fileReader = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
