package com.leonardobarbosa.javastudy.oop.staticmodifier.test;

import com.leonardobarbosa.javastudy.oop.staticmodifier.domain.StaticModifier;

public class StaticModifierExample {
    public static void main(String[] args) {

        StaticModifier carAudi = new StaticModifier("Audi", 299);
        StaticModifier carBmw = new StaticModifier("BMW", 285);
        StaticModifier carWv = new StaticModifier("WV", 289);

        StaticModifier.setLimitSpeed(180);

        carAudi.printCar();
        carBmw.printCar();
        carWv.printCar();

    }
}
