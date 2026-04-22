package com.leonardobarbosa.javastudy.fundamentals.arrays;

public class MatrixTraversalExample {
    public static void main(String[] args) {

        /*
        Obrigado definir o tamanho base na criação do Array
        */

        int[][] arrayInt = new int[2][];
        arrayInt[0] = new int[]{1, 2, 3};
        arrayInt[1] = new int[]{1, 2, 3, 4, 5, 6};


        /*
        Outra forma de inicializar:
        As chaves determinam o tamanho base
         */

        int[][] arrayIntt = {{1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayIntt) {
            System.out.println("\n---------------");
            for (int element : arrayBase) {
                System.out.print(element + " ");
            }
        }

    }
}
