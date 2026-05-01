package com.leonardobarbosa.javastudy.exceptions.custom;

public class CustomCheckedException {
    public static void main(String[] args) {

        /*
        Objetivo: Criar exception obrigatória
        Obrigado a tratar ou declarar
        -----------------------------------------------

        -> Exception= necessita tratar ou declarar
         */

        try {
            process();
        } catch (Processing e) {
            System.out.println("Tratado no main: " + e.getMessage());
        }
    }

    static void process() throws Processing {
        throw new Processing();
    }
}

class Processing extends Exception {

    public Processing() {
        super("Falha no processamento");
    }

    public Processing(String message) {
        super(message);
    }
}