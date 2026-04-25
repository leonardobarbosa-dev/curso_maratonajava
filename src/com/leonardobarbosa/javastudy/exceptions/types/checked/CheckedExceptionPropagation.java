package com.leonardobarbosa.javastudy.exceptions.types.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionPropagation {
    public static void main(String[] args) {

        /*
        Objetivo: Ver a propagação com throws
        readFileTwo= lança -> readFileOne= repassa -> main= trata
        -----------------------------------------------------------

        Checked pode subir mas precisa ser tratada em algum ponto
        try/catch= tratar
        throws= repassar
         */

        try {
            readFileOne();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            System.out.println("Tratado no main");
        }
    }

    public static void readFileOne() throws FileNotFoundException {
        readFileTwo();
    }

    public static void readFileTwo() throws FileNotFoundException {
        FileReader fileReader = new FileReader("text.txt");
    }
}
