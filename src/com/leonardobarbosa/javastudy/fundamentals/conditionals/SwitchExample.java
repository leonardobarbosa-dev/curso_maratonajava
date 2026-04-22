package com.leonardobarbosa.javastudy.fundamentals.conditionals;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //        switch case

        System.out.print("\nEscolha um dia da semana de 1 a 7: ");
        int dia = sc.nextInt();

//        char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");break;
            default:
                System.out.println("Opção inválida! Digite um número de 1 á 7...");
                break;

        }

        System.out.print("\nQual o seu sex: (M) masculino (F) feminino:");

        /**
         * Para ler um char com Scanner em Java, você precisa lembrar que não existe
         *         um metodo nextChar() na classe Scanner.
         *
         *         O procedimento padrão é:
         *         Ler uma String
         *
         *         Pegar o primeiro caractere com charAt(0)
         *         sc.next().charAt(0); = pega o primeiro caractere
         *
         *         .toUpperCase() = quando minhas comparações estão em maiúsculo (M) e (F), e
         *         quero ignorar se o usuário digitar minúsculo
         *
         *         .toLowerCase() = quando minhas comparações estão em minúsculo (m) e (f), e
         *         quero ignorar se o usuário digitar maiúsculo
         */

        char sexo = sc.next().toUpperCase().charAt(0);

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção inválida! Digite apenas (M) ou (F)");
        }

        System.out.print("\nEscolha um dia da semana de 1 á 7:");
        int diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
