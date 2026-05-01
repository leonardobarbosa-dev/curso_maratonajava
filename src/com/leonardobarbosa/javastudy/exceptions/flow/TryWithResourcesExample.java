package com.leonardobarbosa.javastudy.exceptions.flow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        /*
        O try with resources gerencia recursos automaticamente sem o uso do finally manual
        O recurso (BufferedReader) é fechado automaticamente (br.close)

        O try with resources só funciona com objetos que implementam= Closeable || AutoCloseable
        (O próprio Java garante o fechamento do recurso)
        ------------------------------------------------------------------------------------

        -> Use try with resources sempre que trabalhar com arquivos, streams ou conexões
         */

        readFileTryWithResources();
    }

    /**
     * Com o uso do try with resources
     */
    static void readFileTryWithResources() {

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line = br.readLine();
            System.out.println("Conteúdo: " + line);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    /**
     * Sem o try with resources
     */
    static void readFile() {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("file.txt"));
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
