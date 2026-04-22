package com.leonardobarbosa.javastudy.oop.methods.test;

import com.leonardobarbosa.javastudy.oop.methods.domain.ArrayMethods;

public class ArrayMethodsExample {
    public static void main(String[] args) {

        ArrayMethods calculadora = new ArrayMethods();
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        calculadora.somaArray(numeros);

        /*
        ------------------------------------------------------------------------------
         */

        calculadora.somaVarArgs(1,2,3,4,5);

        /*
        ------------------------------------------------------------------------------
         */

        ArrayMethods funcionario = new ArrayMethods();

        funcionario.name = "Light Yagami";
        funcionario.age = 19;
        funcionario.printDev();
        funcionario.calculateAverageSalary(2459, 2577, 2899);

    }
}
