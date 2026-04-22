package com.leonardobarbosa.javastudy.oop.association.test;

import com.leonardobarbosa.javastudy.oop.association.domain.Player;

public class AssociationPlayerExample {
    public static void main(String[] args) {

        Player p1 = new Player("Kaká");
        Player p2 = new Player("Pelé");
        Player p3 = new Player("Ronaldinho Gaúcho");

        /*
        Arrays com objetos:
         */
        Player[] players = new Player[] {p1, p2, p3};

        for (Player player : players) {
            player.print();
        }

    }
}
