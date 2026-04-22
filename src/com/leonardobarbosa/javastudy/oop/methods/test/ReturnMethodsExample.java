package com.leonardobarbosa.javastudy.oop.methods.test;

import com.leonardobarbosa.javastudy.oop.methods.domain.ReturnMethods;

public class ReturnMethodsExample {
    public static void main(String[] args) {

        /*
        metodo com retorno
        */

        ReturnMethods calculadora = new ReturnMethods();
        double result = calculadora.subtrairRetornoDouble(20000, 9000);

        System.out.printf("\nSubtrair números (metodo com retorno)\nResultado: %,.2f", result);

        /*
        O metodo tambem pode ser chamado diretamente no print
        */

//        System.out.printf("\nSubtrair números (metodo com retorno)\nResultado: %,.2f"
//                , calculadora.subtrairRetornoDouble(2000, 1000));

    }
}
