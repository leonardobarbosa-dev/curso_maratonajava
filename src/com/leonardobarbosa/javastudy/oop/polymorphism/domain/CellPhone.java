package com.leonardobarbosa.javastudy.oop.polymorphism.domain;

public class CellPhone extends Product {

    public CellPhone(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * 0.6;
    }
}
