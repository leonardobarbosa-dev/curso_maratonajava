package com.leonardobarbosa.javastudy.oop.association.domain;

public class Team {

    private final String teamName;
    private Player[] players;

    public void print() {
        System.out.println("Team: " + this.teamName);
        if(players == null) return;
        for(Player player: players){
            System.out.println("Player name: " + player.getName());
        }
    }

    public Team (String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
