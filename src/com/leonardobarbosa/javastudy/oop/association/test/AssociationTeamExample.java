package com.leonardobarbosa.javastudy.oop.association.test;

import com.leonardobarbosa.javastudy.oop.association.domain.Player;
import com.leonardobarbosa.javastudy.oop.association.domain.Team;

public class AssociationTeamExample {
    public static void main(String[] args) {

        Team team1 = new Team("Brazil");

        Player p1 = new Player("Ronaldinho Gaúcho", new Team("Alemanha"));

        p1.print();
        System.out.println();
        
        p1.setTeam(team1);

        p1.print();
    }
}
