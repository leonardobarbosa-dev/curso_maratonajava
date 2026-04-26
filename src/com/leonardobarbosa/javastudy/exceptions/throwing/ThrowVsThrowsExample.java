package com.leonardobarbosa.javastudy.exceptions.throwing;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowVsThrowsExample {
    public static void main(String[] args) {

        /*
        THROWS ->  Ele informa ao compilador e ao chamador (o main)
        que este metodo é perigoso e pode falhar ao buscar o arquivo.

        THROW -> Usado para criar e lançar o objeto de erro
        Ele interrompe o fluxo normal e transfere o controle para o bloco catch mais próximo.
         */

        // 3. TRY/CATCH: Tenta executar o código e captura possíveis erros
        try {
            readFile("text.txt");
            // Tratamento da exceção
        } catch (FileNotFoundException e) {
            System.out.println("Erro capturado no main: " + e.getMessage());
        }
    }

    // 1. THROWS: O metodo avisa que pode lançar uma FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        if (!file.exists()) {
            // 2. THROW: Lança a exceção explicitamente se o arquivo não existir
            throw new FileNotFoundException("Arquivo não encontrado.");
        }
        System.out.println("Arquivo encontrado.");
    }
}
