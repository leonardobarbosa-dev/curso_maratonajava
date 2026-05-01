package com.leonardobarbosa.javastudy.exceptions.custom;

public class CustomUncheckedException {
    public static void main(String[] args) {

        /*
        Objetivo: Criar exception não obrigatória
        Não necessita de try/catch
        ---------------------------------------------------

        -> RuntimeException= não necessita de tratamento
         */

        validateAge(15);
    }

    static void validateAge(int age) {
        if (age <18) {
            throw new InvalidAgeException();
        }
    }
}

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        super("Invalid age");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
