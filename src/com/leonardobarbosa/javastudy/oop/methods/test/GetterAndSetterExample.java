package com.leonardobarbosa.javastudy.oop.methods.test;

import com.leonardobarbosa.javastudy.oop.methods.domain.GetterAndSetterMethods;

public class GetterAndSetterExample {
    public static void main(String[] args) {

        GetterAndSetterMethods shinigami = new GetterAndSetterMethods();

        shinigami.setName("Ryuuk");
        shinigami.setAge(999);

        System.out.println(shinigami.getName());
        System.out.println(shinigami.getAge());
    }
}
