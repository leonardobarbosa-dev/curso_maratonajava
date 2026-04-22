package com.leonardobarbosa.javastudy.oop.methods.overloading.test;

import com.leonardobarbosa.javastudy.oop.methods.overloading.domain.MethodOverloading;

public class MethodOverloadingExample {
    public static void main(String[] args) {

        MethodOverloading anime = new MethodOverloading();

        anime.init("Death Note", "Suspense/Investigação", 2, 44);
        anime.imprimir();
    }
}
