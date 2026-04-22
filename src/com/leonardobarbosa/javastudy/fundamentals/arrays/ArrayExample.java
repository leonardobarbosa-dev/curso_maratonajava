package com.leonardobarbosa.javastudy.fundamentals.arrays;

public class ArrayExample {
    public static void main(String[] args) {

        /*
        Inicialização :

        Tipos primitivos: (fora de um metodo)
            byte, short, int, long, float e double = 0
            char = '\u0000' espaço em branco = ' '
            boolean = false

        Referência:
            String = null

         */
//      indice sempre começa na posição [0]

        int[] idades = new int[5];
        idades[0] = 26;
        idades[1] = 19;
        idades[2] = 30;

//        Outra forma de iniciar o Array:
//        int[] idades = {14, 56, 39};     ||      int[] idades = new int[] {14, 56, 39};

//        for (int i = 0; i < idades.length; i++) {
//            System.out.println("Índice " + i +  " = " + idades[i]);
//        }

//        for each = <tipo> <Array>
//        Não mostra a posição do índice, apenas lista

        for (int i : idades) {
            System.out.println(i);
        }


//        System.out.println("idades: " + Arrays.toString(idades));

    }
}
