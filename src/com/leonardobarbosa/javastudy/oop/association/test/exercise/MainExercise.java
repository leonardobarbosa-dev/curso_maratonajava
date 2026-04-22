package com.leonardobarbosa.javastudy.oop.association.test.exercise;

import com.leonardobarbosa.javastudy.oop.association.domain.exercise.Aluno;
import com.leonardobarbosa.javastudy.oop.association.domain.exercise.Professor;
import com.leonardobarbosa.javastudy.oop.association.domain.exercise.Seminario;

public class MainExercise {
    public static void main(String[] args) {

        /*
        Crie um sistema que gerencie seminários
        O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado.

        Um aluno poderá estar em apenas um seminário
        Um seminário poderá ter nenhum ou vários alunos
        Um professor poderá ministrar vários seminários
        Um seminário deve ter um local

        Campos básicos (excluindo relacionamento)
        Seminário: título
        Aluno: name, age
        Professor: name, especialidade
        Local: endereço
         */

        Seminario seminario0 = new Seminario("Seminário Python", "IA Enterprise");
        seminario0.imprimir();
        System.out.println();

        Aluno aluno1 = new Aluno("João", 29);
        aluno1.setSeminario(seminario0);
        aluno1.imprimir();
        Aluno[] alunos = {aluno1};

        Seminario seminario1 = new Seminario("Seminário Java", "Banco ITAU", alunos);
        seminario1.imprimir();

        aluno1.setSeminario(seminario1);
        aluno1.imprimir();

        Seminario[] seminarios = {seminario0, seminario1};

        Professor professor = new Professor("Frederico Guanabara", "Java e Python", seminarios);
        professor.imprimir();
    }
}
