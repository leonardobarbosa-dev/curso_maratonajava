package com.leonardobarbosa.javastudy.exceptions.custom;

public class BusinessExceptionExample {
    public static void main(String[] args) {

        /*
        Objetivo: Usar exception com significado de negócio
        Nome da exception comunica o problema
        ----------------------------------------------------

        -> O nome da exception deve explicar o erro sem precisar de comentário
         */

        drawSomeMoney(2000);
    }

    static double balance = 1000;

    static void drawSomeMoney(double value) {
        if (value > balance) {
            throw new InsufficientBalanceException();
        }
        balance -= value;
        System.out.println("Saque relizado");
    }
}

class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException() {
        super();
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

