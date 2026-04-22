package com.leonardobarbosa.javastudy.oop.constructors.test;
import com.leonardobarbosa.javastudy.oop.constructors.domain.Constructor;

public class ConstructorExample {
    public static void main(String[] args) {

        Constructor anime = new Constructor("Death Note", "Suspense/Investigação", 2, 44);
        anime.imprimir();
    }
}
