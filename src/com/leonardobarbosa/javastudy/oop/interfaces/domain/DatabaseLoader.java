package com.leonardobarbosa.javastudy.oop.interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Iniciando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões dentro do banco de dados...");
    }
}
