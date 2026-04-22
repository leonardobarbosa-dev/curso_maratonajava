package com.leonardobarbosa.javastudy.fundamentals;

public class OperatorsExample {
    public static void main(String[] args) {

        /*

        Operadores Aritméticos:

        + = adição
        - = subtração
        * = multiplicação
        / = divisão
        % = resto da divisão (3 % 2) resto da divisão = 1
        
         */

        int n1 = 10;
        int n2 = 5;
        int resultado = n1 % n2;
        System.out.println(resultado);


        /*

        Operadores Relacionais

        < = menor que
        > = maior que
        <= = menor ou igual
        >= = maior ou igual
        == = igual
        != = diferente

        Sempre vão retornar boolean (True or False)

         */

        boolean diferente = 10 != 20;
        System.out.println(diferente);

        /*

        Operadores Lógicos

        && = E / AND
        || = OU / OR
        ! = NÃO / NOT

         */

        int idade = 19;
        int pesoMaximo = 85;
        boolean aptoAoTrabalho = idade > 21 && pesoMaximo <= 85;
        System.out.println(aptoAoTrabalho);

        /*

        Operadores de atribuição

        = = atribuição
        += = valorX = valorX + valorY
        -= = valorX = valor X - valorY
        *= = valorX = valorx * 2
        /= = valorX = valorX / 2
        %= = valorX = valorX % 2

         */

        int bonus = 1000;
        bonus += 2000;
        System.out.println(bonus);

        /*

        Operadores Unários

        ++ = +1
        -- = -1

         */

        int contador = 0;
        contador++;
        System.out.println(contador);

        int contador2 = 9;
        System.out.println(++contador2); // antes da variável = incrementa, depois executa
    }
}