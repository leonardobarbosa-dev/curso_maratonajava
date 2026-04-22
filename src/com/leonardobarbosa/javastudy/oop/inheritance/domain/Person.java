package com.leonardobarbosa.javastudy.oop.inheritance.domain;

public class Person {


    protected String name;
    protected String cpf;
    protected Adress adress;

    /*
    Protected vai dar acesso direto a variavel a todas
    as subclasses independente de onde estiverem,
    porem todas as classes que estao no mesmo pacote tambem tem acesso
     */

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String cpf, Adress adress) {
        this(name); //Antes de construir completamente o objeto, use outro construtor como base.
        this.cpf = cpf;
        this.adress = adress;
    }

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.adress.getRoad() + " Cep: "  + this.adress.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
