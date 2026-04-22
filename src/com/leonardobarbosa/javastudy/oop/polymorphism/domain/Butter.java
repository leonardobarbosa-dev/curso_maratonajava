package com.leonardobarbosa.javastudy.oop.polymorphism.domain;

public class Butter extends Product {

    private final String expirationDate;

    public Butter(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateTax() {
        return this.price * 0.2;
    }

    public String getExpirationDate() {
        return expirationDate;
    }


}
