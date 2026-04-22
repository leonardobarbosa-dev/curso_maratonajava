package com.leonardobarbosa.javastudy.fundamentals.loops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCalcular parcelas de financiamento:");

        System.out.print("\nDigite o valor do carro:");
        double valorCarro = sc.nextDouble();
        sc.nextLine();

        for ( int parcelas = 1; parcelas <= valorCarro; parcelas++ ) {
            double valorParcela = valorCarro / parcelas;
            if(valorParcela >= 1000) {
                System.out.println("\nDentro do if: ");
                System.out.printf("Valor total do carro: %,.2f\n%d parcelas de %,.2f\n",
                        valorCarro, parcelas, valorParcela);
            } else {
                break; // o break impede que fora do if (parcelas) continue contando até o valor do carro
            }
            System.out.println("\nfora do if: \n" + parcelas);
        }

        sc.close();

    }
}
