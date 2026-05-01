package com.leonardobarbosa.javastudy.exceptions.custom;

public class CustomExceptionBasic {
    public static void main(String[] args) {

        /*
        Objetivo: Criar primeira exception
        Ela herda comportamento de RuntimeException
        -----------------------------------------------------

        ->Custom exception é uma classe que representa um erro especófico
         */
        throw new CustomException();
    }
}

class CustomException extends RuntimeException {

    public CustomException() {
        super("Erro customizado");
    }

    public CustomException(String message) {
        super(message);
    }
}



