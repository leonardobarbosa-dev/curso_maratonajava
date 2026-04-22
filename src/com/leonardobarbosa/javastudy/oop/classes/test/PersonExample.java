package com.leonardobarbosa.javastudy.oop.classes.test;

import com.leonardobarbosa.javastudy.oop.classes.domain.Person;

public class PersonExample {
    public static void main(String[] args) {

        Person estudante = new Person();
        estudante.name = "João";
        estudante.age = 19;
        estudante.sex = 'M';

        System.out.printf("\nEstudante: %s - Idade: %d - Sexo: %c"
        ,  estudante.name, estudante.age, estudante.sex);
    }
}
