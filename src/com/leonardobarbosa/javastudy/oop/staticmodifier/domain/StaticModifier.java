package com.leonardobarbosa.javastudy.oop.staticmodifier.domain;

public class StaticModifier {

    private String make;
    private int maxSpeed;

    /*
    Ao usar o modificadpr static o atributo pertence a classe e
    todos os objetos vao compartilhar o mesmo valor
     */
    private static int limitSpeed = 250;
    /*
    Ao usar o modificador de acesso static na variavel,
    ela nao pertence mais ao objeto e sim a classe.
    Todos os objetos criados dessa classe vao ter a velocidade limite como padrao.
     */

    public StaticModifier(String make, int maxSpeed) {
        this.make = make;
        this.maxSpeed = maxSpeed;
    }

    public void printCar() {
        System.out.println("---------------");
        System.out.println("Marca: " + this.make);
        System.out.println("Velocidade Maxima: " + this.maxSpeed);

        System.out.println("Velocidade Limite: " + StaticModifier.limitSpeed);
        /*
        O this.limitSpeed nao deve ser usado e sim a classe
        Carro.limitSpeed
         */
    }

    public static int getLimitSpeed() {
        return StaticModifier.limitSpeed;
    }

    public static void setLimitSpeed(int limitSpeed) {
        StaticModifier.limitSpeed = limitSpeed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
