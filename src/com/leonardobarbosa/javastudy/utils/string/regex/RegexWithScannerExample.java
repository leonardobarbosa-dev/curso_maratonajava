package com.leonardobarbosa.javastudy.utils.string.regex;

import java.util.Scanner;

public class RegexWithScannerExample {
    public static void main(String[] args) {

        /*
          Scanner - tokens e delimitadores
          - scanner divide a entrada em tokens com base em um delimitador
          - delimitador padrão: espaço em branco
          - tokens são as "fatias" entre os delimitadores
         */

        // Delimitador padrão
        String text = "Java é muito verboso";
        Scanner sc = new Scanner(text);
        while (sc.hasNext()) {
            System.out.println(sc.next());  // java | é | muito | verboso
        }
        System.out.println();
        sc.close();


        // Trocando delimitador por regex
        String message = "nome, idade, CPF, endereço,";
        sc = new Scanner(message);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.println(sc.next().trim());   // trim() remove espaços em branco
        }
        System.out.println();
        sc.close();

        // Lendo tipos específicos
        String specific = "Java, Python, 3.14, 200, true, 27, false, 27.1";
        sc = new Scanner(specific);
        sc.useDelimiter(",\\s");    // Remove virgulas e espaços em branco
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                System.out.println("int: " + i);
            } else if (sc.hasNextDouble()) {
                double d = sc.nextDouble();
                System.out.println("double: " + d);
            } else if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println("boolean:  " + b);
            } else {
                System.out.println("String: " + sc.next());
            }
        }
        sc.close();
    }
}
