package com.leonardobarbosa.javastudy.exceptions.types.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywordExample {
    public static void main(String[] args) {

        /*
        Objetivo: Usar throws ao invés de tratar
        Exception é "repasse" de responsabilidade
        ----------------------------------------------------
        throws adia o tratamento para quem chamou
         */

//        readFile();

    }

    public static void readFile() throws FileNotFoundException {
            FileReader fileReader = new FileReader("text.txt");

    }
}
