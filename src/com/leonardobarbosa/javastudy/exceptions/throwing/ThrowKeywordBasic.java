package com.leonardobarbosa.javastudy.exceptions.throwing;

public class ThrowKeywordBasic {
    public static void main(String[] args) {

        /*
        Primeiro contado com throw
        -> Criando exception manualmente e o fluxo é interrompido
         */
        checkAge(17);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("A idade mínima é 18.");
        }
        System.out.println("Acesso liberado");
    }
}
