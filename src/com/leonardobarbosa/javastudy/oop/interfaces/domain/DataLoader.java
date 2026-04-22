package com.leonardobarbosa.javastudy.oop.interfaces.domain;

public interface DataLoader {

    /*
    Todos as variaveis são <public> <static> <final> = constantes
     */

    public static final int MAX_DATA_SIZE = 10;


    /*
    Por padrão, todos os metodos criados sao <public abstract>
    Caso não seja, o metodo precisa ser default para não precisar ser implementado obrigatoriamente
     */

    public abstract void load();



    /*
    metodo default= nao precisa ser implementado(obrigatoriamente)
     */

    default void checkPermission() {
        System.out.println("Método default dentro da interface");
    }

    /*
    É possivel criar metodos static
    <Nao podem ser sobrescritos>
     */

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro da interface DataLoader");
        System.out.println("Tamanho máximo dos dados : " + DataLoader.MAX_DATA_SIZE);
    }

}
