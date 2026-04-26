package com.leonardobarbosa.javastudy.exceptions.throwing;

public class CustomValidationThrow {
    public static void main(String[] args) {

        /*
        Validar entrada de dados
        throw é usado para proteger as regras do sistema
         */
        registerUser("Leonardo");
    }

    public static void registerUser(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
        System.out.println("Usuário cadastrado: " + name);
    }
}
