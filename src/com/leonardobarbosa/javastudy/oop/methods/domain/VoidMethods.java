package com.leonardobarbosa.javastudy.oop.methods.domain;


public class VoidMethods {

    /*
    Primeira parte de um metodo: modificador de acesso
    Segunda parte de um metodo: retorno
    Terceira parte de um metodo: name do metodo
     */

    public void somarSemParametros() {
        System.out.println("\nSomar números sem parâmetros:");
        System.out.println("Resultado: " + (15+100));
    }

    public void somaDoisNumeros(int a, int b) {
        int resultado = a + b;
        System.out.println("\nSoma números com parâmetros:");
        System.out.printf("Resultado: " + resultado + "\n");
    }


    /*
    ---------------------------------------------------------------------------------------

    O return; funciona como um break em metodos void
    Tambem ficaria correto adicionando o else, mas com return o codigo fica mais limpo
     */

    public void divisaoVoid(double a, double b) {
        if (b == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println("Resultado divisão: " + (a/b));
    }

    /*
    ---------------------------------------------------------------------------------------
     */

    public void alteraDoisNumeros(int a, int b) {
        a = 99;
        b = 90;
        System.out.println("\nDentro do alteraDoisNumeros");
        System.out.println("Num a " + a + " e Num b " + b);
    }
}
