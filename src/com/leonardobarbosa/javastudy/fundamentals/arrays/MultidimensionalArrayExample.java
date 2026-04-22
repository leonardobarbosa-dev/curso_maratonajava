package com.leonardobarbosa.javastudy.fundamentals.arrays;

import java.util.Scanner;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1º Array (vetor) = nomes
        2º Array (matriz) = notas
         */

        String[] nomes = new String[3];
        double[][] notas = new double[3][4];

        System.out.println("\n------------------------------");
        System.out.println("---Cadastro de alunos e notas---");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o name do " + (i+1) + "º aluno: ");
            nomes[i] = sc.nextLine();
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a " + (j+1) + "ª nota: ");
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        System.out.println("\n-----NOTAS-----");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nAluno: " + nomes[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Notas: " + notas[i][j]);
            }
        }

    }
}
