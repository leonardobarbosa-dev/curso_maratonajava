package com.leonardobarbosa.javastudy.oop.polymorphism.test;

import com.leonardobarbosa.javastudy.oop.polymorphism.domain.CellPhone;
import com.leonardobarbosa.javastudy.oop.polymorphism.domain.Laptop;
import com.leonardobarbosa.javastudy.oop.polymorphism.domain.Butter;
import com.leonardobarbosa.javastudy.oop.polymorphism.domain.Product;
import com.leonardobarbosa.javastudy.oop.polymorphism.service.CalculateTax;

public class PolymorphismExample {

    public static void main(String[] args) {

        /*
        - Criar uma classe abstract (Product)
        - Criar uma interface (ProductTax) com metodo calculateTax e implementar na classe Product
        - Criar Classe (CalculateTax) no pacote service para fazer o relatório, ela recebe um Product
        - Criar duas ou mais classes que sejam (Products) e uma delas tenha alguma descricao extra

          usar (instanceof) para instanciar o product e assim obter a descricao extra do produto
          exemplo: <object name> instanceof <class Name> <reference class Name>
        */

        Product cellphone = new CellPhone("Samsung S23", 5300);
        CalculateTax.calculateTax(cellphone);
        System.out.println("---------------------------------");

        Product laptop = new Laptop("Lenovo Loq", 4800);
        CalculateTax.calculateTax(laptop);
        System.out.println("---------------------------------");

        Butter butter = new Butter("Manteiga da Roça", 45, "30 dias");
        CalculateTax.calculateTax(butter);

    }
}
