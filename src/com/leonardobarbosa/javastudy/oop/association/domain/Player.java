package com.leonardobarbosa.javastudy.oop.association.domain;

public class Player {

    private final String name;
    private Team team;

    public void print() {
        System.out.println("Player name: " + this.name);
        if (team != null) {
            System.out.println("Team: " + team.getTeamName());
        }
    }

    // Constructor

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Team team){
        this.name = name;
        this.team = team;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }



    public void setTeam(Team team) {
        this.team = team;
    }
}
