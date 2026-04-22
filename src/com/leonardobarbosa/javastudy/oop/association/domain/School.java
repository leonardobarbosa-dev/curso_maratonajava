package com.leonardobarbosa.javastudy.oop.association.domain;

public class School {

    private String name;
    private Teacher[] professors;

    public void print() {
        System.out.println("\nSchool name: " + this.name);
        if(professors == null) {
            return;
        }
        for (Teacher professor : professors) {
            System.out.println("Professor: " + professor.getName());
        }
    }

    public School(String name) {
        this.name = name;
    }

    public School(String name, Teacher[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
