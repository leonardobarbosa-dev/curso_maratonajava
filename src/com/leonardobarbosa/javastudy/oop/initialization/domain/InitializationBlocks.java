package com.leonardobarbosa.javastudy.oop.initialization.domain;

public class InitializationBlocks {

    private String name;
    private final int[] episodes;

    /*
    1°- Alocado espaco em memoria para o objeto
    2°- Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    3°- Bloco de inicializaçao é executado
    4°- Construtor é executado
     */

    {
        System.out.println("Bloco de inicialização de instancia");

        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }

    }
    /*
    - Bloco de inicializacao nao estático ou de instancia: É executado sempre que o objeto é criado
    - Sempre antes do construtor
    os valores sempre serao atribuidos ao array sem necessidade de colocar os
    100 valores separadamente e nem colocar o for dentro do main
     */

    public InitializationBlocks(String name) {
        this.name = name;
    }

    public InitializationBlocks() {
        for (int episode : this.episodes) {
            System.out.print(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}

