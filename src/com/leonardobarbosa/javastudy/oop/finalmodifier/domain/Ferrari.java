package com.leonardobarbosa.javastudy.oop.finalmodifier.domain;

public final class Ferrari extends Car {

    /*
    Classe final= não pode ser herdada (extends) - ninguém pode criar subclasse dela
     */

    public Ferrari(String nome, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
    }

    /*
    Metodo final= pode herdar a classe mas não pode sobrescrever esse metodo
     */
    public void mensagemFerrari() {
        System.out.println("|||Viva a aventura de uma ferrari|||");
    }

}
