package com.leonardobarbosa.javastudy.oop.interfaces.domain;

public class FileLoader implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Iniciando dados de um arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões dentro de um arquivo...");
    }
}
