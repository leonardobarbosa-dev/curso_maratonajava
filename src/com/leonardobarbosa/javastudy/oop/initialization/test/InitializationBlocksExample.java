package com.leonardobarbosa.javastudy.oop.initialization.test;

import com.leonardobarbosa.javastudy.oop.initialization.domain.InitializationBlocks;

public class InitializationBlocksExample {
    public static void main(String[] args) {

        InitializationBlocks anime = new InitializationBlocks("Death Note");
        System.out.println(anime.getName());

        InitializationBlocks anime1 = new InitializationBlocks();

        System.out.println();

        for(int episode : anime.getEpisodes()) { //anime.getEpisodes() + Alt + enter = foreach
            System.out.print(episode + " ");
        }

    }
}
