package com.leonardobarbosa.javastudy.oop.association.domain.exercise;

public class Seminario {

    private String nome;
    private String local;
    private Aluno[] alunos;


    public void imprimir() {
        System.out.println("Seminário: " + this.nome);
        System.out.println("Local: " + this.local);
        if(alunos == null) return;
        for(Aluno aluno: alunos){
            System.out.println("Aluno: " + aluno.getNome() + "| Idade: " + aluno.getIdade());
        }
        System.out.println();
    }

    public Seminario(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario(String nome, String local, Aluno[] aluno) {
        this.nome = nome;
        this.local = local;
        this.alunos = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Aluno[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }
}