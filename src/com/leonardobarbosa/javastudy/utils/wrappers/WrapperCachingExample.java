package com.leonardobarbosa.javastudy.utils.wrappers;

public class WrapperCachingExample {
    public static void main(String[] args) {

        /**
         * CACHE INTERNO DAS WRAPPERS
         * Para otimização de memória, Java reutiliza objetos wrapper para valores frequentes:
         *
         * Integer, Short, Byte, Long → cache de -128 a 127
         * Character                  → cache de 0 a 127 (ASCII)
         * Boolean                    → sempre reutiliza TRUE e FALSE
         * Float, Double              → NÃO possuem cache
         *
         * Dentro do range: valueOf() retorna o mesmo objeto (== é true)
         * Fora do range:   valueOf() cria novo objeto (== é false)
         *
         * CONCLUSÃO: Nunca use == para comparar wrappers. Use sempre equals().
         */

        // Dentro do cache (-128 a 127) → mesmo objeto
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);      // true  → mesmo objeto do cache
        System.out.println(a.equals(b)); // true  → mesmo valor

        // Fora do cache → objetos diferentes
        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);      // false → objetos diferentes!
        System.out.println(c.equals(d)); // true  → mas valor é igual

        // Autoboxing também usa o cache
        Integer e = 127;
        Integer f = 127;
        System.out.println(e == f); // true  → cache

        Integer g = 128;
        Integer h = 128;
        System.out.println(g == h); // false → fora do cache

        // Boolean sempre retorna o mesmo objeto
        Boolean t1 = Boolean.valueOf(true);
        Boolean t2 = Boolean.valueOf(true);
        System.out.println(t1 == t2); // true → sempre reutiliza Boolean.TRUE

        // Double: sem cache
        Double x = 1.0;
        Double y = 1.0;
        System.out.println(x == y);      // false → sem cache
        System.out.println(x.equals(y)); // true
    }
}
