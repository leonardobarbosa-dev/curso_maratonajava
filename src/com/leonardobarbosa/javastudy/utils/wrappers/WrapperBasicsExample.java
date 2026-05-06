package com.leonardobarbosa.javastudy.utils.wrappers;

public class WrapperBasicsExample {
    public static void main(String[] args) {

        /**
         * CLASSES WRAPPER
         * - Todos os tipos primitivos tem uma classe correspondente no java.lang
         * - Permitem que primitivos sejam usados como objetos (necessário em Collections, Generics, etc.)
         * - Primitivo -> rápido, leve, armazenado na stack
         * - Wrapper  -> objeto, armazenado na heap, pode ser null
         *
         * TABELA DE CORRESPONDÊNCIA:
         * byte    -> Byte
         * short   -> Short
         * int     -> Integer
         * long    -> Long
         * float   -> Float
         * double  -> Double
         * char    -> Character
         * boolean -> Boolean
         */

        // Criando wrappers
        Byte bt = 1;
        Short sh = 1;
        Integer i = 42;
        Long l = 4L;
        Float f = 4F;
        Double  d = 3.14D;
        Character c = 'A';
        Boolean b = Boolean.TRUE;

        // Wrappers podem ser null (primitivos não podem)
        Integer nulo = null;
        System.out.println(nulo); // null -> sem erro
        // int primitivo = null; -> ERRO de compilação

    }
}
