package com.leonardobarbosa.javastudy.utils.wrappers;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    public static void main(String[] args) {

        /**
         * AUTOBOXING E UNBOXING
         * - Autoboxing:  Java converte automaticamente primitivo -> wrapper
         * - Unboxing:    Java converte automaticamente wrapper   -> primitivo
         * - Introduzido no Java 5 para facilitar o uso com Collections e Generics
         *
         * CUIDADO: Unboxing em objeto null lança NullPointerException!
         */

        // Autoboxing -> int vira Integer automaticamente
        Integer a = 10;      // equivale a: Integer.valueOf(10)
        Double d = 3.14;    // equivale a: Double.valueOf(3.14)

        // Unboxing -> Integer vira int automaticamente
        int x = a;           // equivale a: a.intValue()
        double y = d;        // equivale a: d.doubleValue()

        System.out.println(x + y); // 13.14

        // Autoboxing em Collections (List só aceita objetos, não primitivos)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);   // autoboxing: 1 vira Integer
        numbers.add(2);
        numbers.add(3);

        int sum = 0;
        for (int n : numbers) {  // unboxing: Integer vira int
            sum += n;
        }
        System.out.println("Soma: " + sum); // 6

        // Operações aritméticas com wrappers causam unboxing
        Integer p = 10;
        Integer q = 20;
        int result = p + q;  // unboxing implícito antes da soma
        System.out.println(result); // 30

        // ATENÇÃO: == com wrappers compara referência, não valor (fora do cache)
        Integer w1 = 200;
        Integer w2 = 200;
        System.out.println(w1 == w2);     // false -> objetos diferentes (fora do cache -128 a 127)
        System.out.println(w1.equals(w2)); // true  -> mesmo valor
    }
}
