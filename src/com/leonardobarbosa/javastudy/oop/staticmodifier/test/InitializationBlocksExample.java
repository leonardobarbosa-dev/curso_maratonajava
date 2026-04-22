package com.leonardobarbosa.javastudy.oop.staticmodifier.test;

import com.leonardobarbosa.javastudy.oop.staticmodifier.domain.StaticInitializationBlock;

public class InitializationBlocksExample {
    public static void main(String[] args) {

        /*
        Bloco de inicializaçao static é executado apenas uma vez quando a JVM carrega a classe
        Bloco de inicializaçao not static é executado sempre que um objeto é criado
         */
        StaticInitializationBlock Block1 = new StaticInitializationBlock();
        StaticInitializationBlock Block2 = new StaticInitializationBlock();
        StaticInitializationBlock Block3 = new StaticInitializationBlock();
    }
}
