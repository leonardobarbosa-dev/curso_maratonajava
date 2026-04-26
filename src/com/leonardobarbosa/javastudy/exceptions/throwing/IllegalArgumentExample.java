package com.leonardobarbosa.javastudy.exceptions.throwing;

public class IllegalArgumentExample {
    public static void main(String[] args) {

        /*
        Objetivo: Usar exception mais adequada
        IllegalArgumentException= lançada para indicar que um metodo recebeu um argumento inválido,
        inadequado ou fora do intervalo permitido
        ---------------------------------------------------------------------------------------

        -> usada para validar entradas, garantindo que o código não prossiga com dados incorretos,
        como números negativos onde se espera positivos ou strings vazias em campos obrigatórios
         */
        positiveNumber(5);
    }

    public static void positiveNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo");
        }
        System.out.println("Número válido: " + number);
    }
}
