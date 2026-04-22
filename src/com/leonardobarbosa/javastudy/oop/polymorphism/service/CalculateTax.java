package com.leonardobarbosa.javastudy.oop.polymorphism.service;

import com.leonardobarbosa.javastudy.oop.polymorphism.domain.Butter;
import com.leonardobarbosa.javastudy.oop.polymorphism.domain.Product;

public class CalculateTax {

    public static void calculateTax(Product product) {
        System.out.println("Relatório do produto:");

        double tax = product.calculateTax();
        System.out.println("Produto: " + product.getName());
        System.out.println("Valor: " + product.getPrice());
        System.out.println("Imposto sobre o valor do produto: " + tax);

        /*
        Tem maneiras melhores de fazer isso, mas esse é apenas um exemplo e, como o Produto(Butter)
        é o único que tem esse atributo (expirationDate), o instanceof resolve...

        instanceof = último recurso, não primeira opção

         */
        if (product instanceof Butter butter){
            System.out.println("Validade: " + butter.getExpirationDate());
        }
    }
}
