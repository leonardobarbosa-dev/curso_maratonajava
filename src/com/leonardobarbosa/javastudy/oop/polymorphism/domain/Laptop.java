package com.leonardobarbosa.javastudy.oop.polymorphism.domain;

public class Laptop extends Product {

    public Laptop(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * 0.5;
    }
}
