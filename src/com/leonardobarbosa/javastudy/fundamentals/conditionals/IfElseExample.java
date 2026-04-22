package com.leonardobarbosa.javastudy.fundamentals.conditionals;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

//        if - elseif - else

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular porcentagem de impostos");
        System.out.print("Digite seu salário:");
        double salarioBruto = sc.nextDouble();

        double primeiraTaxaImposto = 0.10;
        double segundaTaxaImposto = 0.20;
        double terceiraFaixaImposto = 0.35;
        double quartaFaixaImposto = 0.45;
        double imposto;

        if (salarioBruto > 0 && salarioBruto <= 5000) {
            imposto = salarioBruto * primeiraTaxaImposto;
        } else if (salarioBruto <= 15000) {
            imposto = salarioBruto * segundaTaxaImposto;
        } else if (salarioBruto <= 50000) {
            imposto = salarioBruto * terceiraFaixaImposto;
        } else {
            imposto = salarioBruto * quartaFaixaImposto;
        }

        double salarioLiquido = salarioBruto - imposto;
        
        System.out.printf("Sálario bruto : %,.2f - Impostos: %,.2f - Salário liquido: %,.2f\n"
                , salarioBruto, imposto, salarioLiquido);



//      SE - SENAO SE - SENAO

//        System.out.println("Dentro do JOptionPane:");
//
//        int age = 19;
//        boolean isAutorizadoComprarBedida = age >= 18;
//        boolean isMaiorAcompanhando = false;
//
//        if (isAutorizadoComprarBedida) {
//            JOptionPane.showMessageDialog(null,
//                    "Autorizado a comprar bebida alcoólica");
//        } else if (isMaiorAcompanhando) {
//            JOptionPane.showMessageDialog(null,
//                    "Autorizado a comprar bebida acompanhado de maior de age");
//        } else {
//            JOptionPane.showMessageDialog(null,
//                    "Não tem age suficiente parra comprar bebida alcoólica");
//        }


        /**
         * Operador ternário
         *
         *          USAR = (condição) ? verdadeiro : falso
         *
         *          NÃO USAR = (condicao) ? verdadeiro(SE) : (condicao)(SENAO SE) ? verdadeiro(SE) : falso(SENAO)
         *          Fica muito difícil de ler, mas é possível, usar apenas a opção (IF ELSE)
         */

        double salario = 5000;
        String mensagemDoar = "\nDoar 500 reais para a ONG!";
        String mensagemNaoDoar = "\nNão tenho condições de doar para a ONG, Mas vou ter!";
        String resultado = salario > 4000 ? mensagemDoar : mensagemNaoDoar;

        /*
        Também pode ser usado diretamente no sout
        String resultado;
        System.out.println(resultado = salary > 4000 ? mensagemDoar : mensagemNaoDoar);
         */

        boolean possoDoar = salario > 4000;

        System.out.println(resultado);
        System.out.println("Pode doar: " + possoDoar);

        sc.close();
    }
}
