package com.leonardobarbosa.javastudy.oop.staticmodifier.domain;

public class StaticInitializationBlock {

    private String name;
    private static final int[] episodes;

    /*
    0 - Bloco de inicializaçao é executado quando a JVM carregar a classe (static)
    1 - Alocado espaco em memoria para o objeto
    2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    3 - Bloco de inicializaçao é executado (not static)
    4 - Construtor é executado
     */

    static { // O bloco é executado apenas uma vez
        System.out.println("\nBloco de inicialização static");

        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    {
        System.out.println("Bloco de inicialização not static");
    }
    /*
    - Bloco de inicializacao not static: É executado sempre que o objeto é criado
    - Sempre antes do construtor
    os valores sempre serao atribuidos ao array sem necessidade de colocar os
    100 valores separadamente e nem colocar o for dentro do main
     */

    public StaticInitializationBlock(String nome) {
        this.name = nome;
    }

    public StaticInitializationBlock() {
        for (int episode : StaticInitializationBlock.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}

