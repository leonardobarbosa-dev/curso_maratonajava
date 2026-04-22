package com.leonardobarbosa.javastudy.oop.abstraction.domain;

public abstract class Worker extends Person {

    /*
    Classes abstratas não podem ser instanciadas
    - Servem apenas como base para outras classes

    Podem conter:
    - Metodos concretos (com código)
    - Metodos abstratos (sem código)
    - Construtores

    Para que serve:
    - Evitar duplicacao
    - Centralizar regras comuns
    - Definir uma estrutura base
     */

    /*
    Classe abstract define - “o que deve ser feito”
    Classe filha define - “como será feito”
     */
    protected String name;
    protected double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /*
    getClass() = retorna o objeto do tipo Class (<pacote> <name da classe>)
    getSimpleName() = pega só o name da classe sem pacote, o retorno fica (<name da classe>)
     */
    @Override
    public String toString() {
        return String.format("%s{name= %s, salary= %,.2f, bonus= %,.2f}",
                this.getClass().getSimpleName(),
                this.name,
                this.salary,
                calculateBonus());
    }

    public abstract double calculateBonus();

    @Override
    public void print() {
        System.out.println("Metodo da classe Person herdado pela classe Worker");
    }

    public String getName() {
        return name;
    }
}

