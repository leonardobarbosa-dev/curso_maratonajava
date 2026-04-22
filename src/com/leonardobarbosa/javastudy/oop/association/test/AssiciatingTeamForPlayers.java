package com.leonardobarbosa.javastudy.oop.association.test;

import com.leonardobarbosa.javastudy.oop.association.domain.Player;
import com.leonardobarbosa.javastudy.oop.association.domain.Team;

public class AssiciatingTeamForPlayers {
    public static void main(String[] args) {

        Player player1 = new Player("Pelé");
        Player player2 = new Player("Ronaldo");

        Team team = new Team("Brazil");

        Player[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        team.print();
    }
}
