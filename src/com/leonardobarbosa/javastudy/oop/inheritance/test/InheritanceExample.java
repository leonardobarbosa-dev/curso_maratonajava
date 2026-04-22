package com.leonardobarbosa.javastudy.oop.inheritance.test;

import com.leonardobarbosa.javastudy.oop.inheritance.domain.Adress;
import com.leonardobarbosa.javastudy.oop.inheritance.domain.Worker;
import com.leonardobarbosa.javastudy.oop.inheritance.domain.Person;

public class InheritanceExample {
    public static void main(String[] args) {

        /*
        Associacao = "TEM" um
        Herança = "É" um
         */

        Adress adress = new Adress();
        adress.setRoad("Rua 2");
        adress.setCep("555790-000");

        Person person = new Person("Ash");
        person.setCpf("12345789-00");
        person.setAdress(adress);
        person.print();

        System.out.println("---------------------------");

        Worker worker = new Worker("Albert Einstein", 19.900);
        worker.setCpf("987654321-00");
        worker.setAdress(adress);
        worker.print();

        worker.relatorioFuncionario();

    }
}
