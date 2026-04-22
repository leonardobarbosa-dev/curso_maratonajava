package com.leonardobarbosa.javastudy.oop.polymorphism.test;

import com.leonardobarbosa.javastudy.oop.polymorphism.repository.Repository;
import com.leonardobarbosa.javastudy.oop.polymorphism.service.DatabaseRepository;

public class InterfaceOrientedProgramingExample {
    public static void main(String[] args) {

        /*
          - Criar pacote repository e interface repository
          - Criar (service) repositorios de (arquivos, banco de dados, memoria)
          - No main, chamar pela referencia<interface> e o objeto do servico desejado...
         */

        Repository repository = new DatabaseRepository();
        repository.save();

        /*
         Programacao orientada a interfaces, ao inves de usar tipo especifico do objeto,
         usa-se o tipo mais generico (Repository) que e uma interface e tem o metodo save();
         Entao e possivel colocar qualquer objeto que faca a implementacao do metodo
         sem precisar alterar mais nada alem do objeto em si

         - Facilidade de manutenção e expansão
         */
    }
}
