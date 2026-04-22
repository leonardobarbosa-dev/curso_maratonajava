package com.leonardobarbosa.javastudy.fundamentals.loops;

public class WhileLoopExample {
    public static void main(String[] args) {

        /**
         *      while = só executa ser for true
         *
         *      do while = executa ao menos uma vez independente da condição ser true ou false
         *
         *      for = Usa índices (int i = 0; i < 10; i++)
         */


//        WHILE:

        int contador = 0;

        System.out.println("\nContador while: ");
        while(contador <= 10){
            System.out.println(contador);
            contador++;
        }

//        DO WHILE:

        int contador2 = 0;

        System.out.println("\nContador do while: ");
        do {
            System.out.println(contador2);
            contador2++;
        } while (contador2 <= 10);

//        FOR:

        System.out.println("\nContador for: ");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

//        BREAK:

        System.out.println("\nUso do break");

        int valorMax = 50;

        for ( int i = 0; i <= valorMax; i++) {
            if(i > 25) {
                break;
            }
            System.out.println(i);
        }

    }
}
