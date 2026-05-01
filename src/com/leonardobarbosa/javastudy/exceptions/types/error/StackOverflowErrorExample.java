package com.leonardobarbosa.javastudy.exceptions.types.error;

public class StackOverflowErrorExample {
    public static void main(String[] args) {

        /*
        Hierarquia simplificada:

         Throwable
           ├── Error        (não tratar) - “Error faz parte da hierarquia, mas não do fluxo de tratamento.”
           └── Exception    (tratar ou propagar)

           StackOverflowError= acontece quando a pilha de chamadas é excedida (estoura a memória) - Loop infinito
           --------------------------------------------------------------------------------------

           -> Erros são falhas graves na JVM e normalmente irrecuperáveis
         */

        recursion();
    }

    static void recursion() {
        recursion();
    }
}
