package com.leonardobarbosa.javastudy.oop.abstraction.test;

import com.leonardobarbosa.javastudy.oop.abstraction.domain.Developer;
import com.leonardobarbosa.javastudy.oop.abstraction.domain.Worker;
import com.leonardobarbosa.javastudy.oop.abstraction.domain.Manager;

public class AbstractionExample {
    public static void main(String[] args) {

        Developer developer = new Developer("Kira", 14500);
        System.out.println(developer);

        Manager manager = new Manager("Ryuuk", 12000);
        System.out.println(manager);

        Worker worker = new Manager("Nicolas Cage", 100000);
        System.out.println(worker);


        developer.print();
        manager.print();
    }
}
