package com.leonardobarbosa.javastudy.exceptions.types.checked;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {

        /*
        Objetivo: Tratar exception usando try/catch
        try/catch resolve obrigação do compilador
         */

        try {
            FileReader fileReader = new FileReader("text.txt");
            fileReader.read();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
