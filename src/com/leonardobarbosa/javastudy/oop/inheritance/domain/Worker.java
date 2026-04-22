package com.leonardobarbosa.javastudy.oop.inheritance.domain;

public class Worker extends Person {

    private double pay;

    public Worker(String name, double pay) {
        super(name); //O super ou this() sempre deve ser a primeira linha do construtor
        this.pay = pay;
    }

    public void print() {
        super.print();
        System.out.printf("Salário: R$%,.3f%n",  this.pay);
    }

    public void relatorioFuncionario() {
        System.out.printf("Eu %s que moro em %s, recebi o valor de R$%,.3f.%n",
                this.name, this.adress.getRoad(), this.pay);
        /*
        Como os atributos de Pessoa estão protected, podem ser acessados diretamente
        pela classe Funcionario com: this.name - this.cpf - this.adress
         */
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
