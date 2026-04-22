package com.leonardobarbosa.javastudy.oop.association.test;

import com.leonardobarbosa.javastudy.oop.association.domain.Teacher;
import com.leonardobarbosa.javastudy.oop.association.domain.School;

public class AssiciationSchoolExample {
    public static void main(String[] args) {


        Teacher kakashi = new Teacher("Kakashi sensei");
        Teacher jiraiya = new Teacher("Jiraiya sensei");

        Teacher[] professors = {kakashi, jiraiya};

        School school = new School("Aldeia da folha", professors);

        school.print();

    }
}
