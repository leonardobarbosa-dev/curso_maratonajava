package com.leonardobarbosa.javastudy.oop.methods.test;


import com.leonardobarbosa.javastudy.oop.methods.domain.VoidMethods;

public class VoidMethodsExample {
    public static void main(String[] args) {

        VoidMethods calculadora = new VoidMethods();
//        metodo sem parametros
        calculadora.somarSemParametros();

//        metodo com parametros
        calculadora.somaDoisNumeros(10, 30);

        calculadora.divisaoVoid(10,2);
        /*
        -------------------------------------------------------------------------------
         */


        /*
        Tipos primitivos nunca passam a referência para outros metodos
        Passam apenas uma copia, a variável original nunca é alterada
         */

        calculadora.alteraDoisNumeros(10, 20);

        int a = 5;
        int b = 5;

        System.out.println("\nFora do alteraDoisNumeros");
        System.out.println("Num a " + a + " e Num b " + b);
    }
}
