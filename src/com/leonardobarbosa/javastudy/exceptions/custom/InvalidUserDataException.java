package com.leonardobarbosa.javastudy.exceptions.custom;

public class InvalidUserDataException {
    public static void main(String[] args) {

        /*
        Padrão comum em sistemas reais
        Validação clara e reutilizável
        ---------------------------------------------------------

        -> Custom Exception evita uso genérico de IllegalArgumentException
         */

        register("");

        /*
        Boas práticas:

        1. Nome claro
        2. Evitar excesso
        3. Na maioria dos casos se usa (RuntimeException= unchecked) - Checked quase não é usado
        4. Sempre passar uma mensagem

        Custom Exception cria um erro com significado, melhora leitura e manutenção
         */
    }

    static void register(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        System.out.println("Usuário cadastrado com sucesso");
    }
}

class InvalidDataException extends Exception {

    public InvalidDataException() {
        super();
    }

    public InvalidDataException(String message) {
        super(message);
    }
}
