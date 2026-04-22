package com.leonardobarbosa.javastudy.oop.finalmodifier.domain;

public class Purchaser {

    private String name;

    @Override
    public String toString() {
        return String.format(" | Comprador: %s%n", this.name);
    }


    public void setName(String name) {
        this.name = name;
    }
}
