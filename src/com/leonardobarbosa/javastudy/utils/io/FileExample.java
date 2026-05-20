package com.leonardobarbosa.javastudy.utils.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {

        /*
        java.io.File - Representação de arquivos e diretórios
        - File representa um caminho (path) no sistema de arquivos
        - Não lê nem escreve conteúdo - apenas gerencia metadados e estrutura
        - O arquivo/diretório pode não existir: File só representa o caminho

        Caminhos:
        - Absoluto - camiho completo desde a raiz: /home/user/arquivo.txt
        - Relativo - relativo ao diretório de execução do projeto

        Separador:
        - File.separator - usa o separador correto por SO (/ no Linux/Mac, \ no Windows)
         */

        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("isDirectory: " + file.isDirectory());
            System.out.println("isFile: " + file.isFile());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Can exec: " + file.canExecute());
            System.out.println("Length: " + file.length());
            System.out.println("isHidden: " + file.isHidden());
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (file.exists()) {
            boolean isDeleted = file.delete();
            System.out.println("Deleated: " + isDeleted);
        }
    }
}
