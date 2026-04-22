package com.leonardobarbosa.javastudy.oop.association.domain.exercise;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimir() {
        System.out.println("\nProfessor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        for(Seminario seminario: seminarios){
            System.out.println("Vai ministrar o seminário: " + seminario.getNome());
            System.out.println("Local: " + seminario.getLocal());
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}