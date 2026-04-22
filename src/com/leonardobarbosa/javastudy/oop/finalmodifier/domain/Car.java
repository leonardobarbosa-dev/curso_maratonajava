package com.leonardobarbosa.javastudy.oop.finalmodifier.domain;

public class Car {

    private String name;
    private final int maxSpeed;
    /*
    Usar final quando o valor é definido na criação e não deve ser alterado ao longo do tempo
     */
    private static final int LIMIT_SPEED = 150;
    /*
    O modificador final faz com que a constante não possa mais ser alterada após ser associada
    Geralmente vem acompanhada do modificador static (todos os objetos compartilham o mesmo valor)
    constantes são escritas em upperCase separadas por underScore: CONSTANTE_JAVA
    -----------------------------------------------------------------------------------------------
    Existe uma única cópia compartilhada por todos os objetos.
     */

    public final Purchaser purchaser = new Purchaser();
    /*
    modificador final com objetos
    bmw.purchaser.setName(); = está alterando o conteúo da casa e não a referência do objeto
    -------------------------------------------------------------------------------------------
    Em Java, o modificador final em tipos de referência impede que
    a variável aponte para outro objeto após a inicialização,
    mas não impede a modificação do estado interno do objeto referenciado.
    -------------------------------------------------------------------------------------------
    Cada objeto possui sua própria referência, que não pode ser alterada
    para apontar para outro objeto, mas o conteúdo do objeto pode ser modificado.
     */

    @Override
    public String toString() {
        return String.format("Carro: %s | Velocidade maxima: %d | Velocidade limite da via: %d",
                this.name, this.maxSpeed, Car.LIMIT_SPEED);
    }

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
