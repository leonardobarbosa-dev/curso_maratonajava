package com.leonardobarbosa.javastudy.oop.association.domain.exercise;

public class Aluno {

    private String nome;
    private int idade;
    private Seminario seminario;

    public void imprimir() {
        System.out.println("Aluno: " + this.nome + "| Idade: " + this.idade);
        if(getSeminario() == null) return;
        System.out.println("Irá participar do seminário: " + seminario.getNome());
        System.out.println();
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        if(this.seminario != null){
            System.out.println("Aluno já está cadastrado em um seminario!!!");
            System.out.println("Seminario cadastrado abaixo: ");
            return;
        }
        this.seminario = seminario;
    }
}