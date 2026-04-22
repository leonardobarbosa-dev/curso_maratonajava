package com.leonardobarbosa.javastudy.oop.finalmodifier.test;

import com.leonardobarbosa.javastudy.oop.finalmodifier.domain.Car;
import com.leonardobarbosa.javastudy.oop.finalmodifier.domain.Ferrari;

public class FinalModifierExample {
    public static void main(String[] args) {

        Car bmw = new Car("BMW X6", 289);
        bmw.purchaser.setName("Bryan");
        System.out.print(bmw);
        System.out.print(bmw.purchaser);

        Car wv = new Car("WV Fusca", 208);
        wv.purchaser.setName("Han");
        System.out.print(wv);
        System.out.print(wv.purchaser);

        Ferrari ferrari = new Ferrari("Ferrari f40", 319);
        ferrari.purchaser.setName("Enzo");
        System.out.print(ferrari);
        System.out.print(ferrari.purchaser);
        ferrari.mensagemFerrari();
    }
}