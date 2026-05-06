package com.leonardobarbosa.javastudy.utils.wrappers;

public class WrapperMethodsExample {
    public static void main(String[] args) {

        /**
         * MÉTODOS ÚTEIS DAS CLASSES WRAPPER
         * Cada wrapper oferece métodos estáticos e de instância para
         * conversão, comparação, parsing e operações bit a bit.
         */

        // Integer
        System.out.println(Integer.parseInt("42"));          // String → int
        System.out.println(Integer.valueOf("42"));           // String → Integer
        System.out.println(Integer.toBinaryString(10));      // "1010"
        System.out.println(Integer.toHexString(255));        // "ff"
        System.out.println(Integer.toOctalString(8));        // "10"
        System.out.println(Integer.parseInt("1010", 2));     // 10 (binário → decimal)
        System.out.println(Integer.parseInt("ff", 16));      // 255 (hex → decimal)
        System.out.println(Integer.max(10, 20));             // 20
        System.out.println(Integer.min(10, 20));             // 10
        System.out.println(Integer.sum(10, 20));             // 30
        System.out.println(Integer.compare(5, 10));          // -1 (negativo → 5 < 10)
        System.out.println(Integer.bitCount(7));             // 3 → bits 1 em 0b111
        System.out.println(Integer.reverse(1));              // inverte os bits
        System.out.println(Integer.signum(-5));              // -1 (negativo), 0, 1 (positivo)

        // Double
        System.out.println(Double.parseDouble("3.14"));      // String → double
        System.out.println(Double.isNaN(Double.NaN));        // true
        System.out.println(Double.isInfinite(1.0 / 0.0));   // true → divisão por zero
        System.out.println(Double.isFinite(3.14));           // true
        System.out.println(Double.compare(3.14, 2.71));      // 1 (positivo → 3.14 > 2.71)

        // Character
        System.out.println(Character.isDigit('5'));          // true
        System.out.println(Character.isLetter('A'));         // true
        System.out.println(Character.isLetterOrDigit('3')); // true
        System.out.println(Character.isWhitespace(' '));     // true
        System.out.println(Character.isUpperCase('A'));      // true
        System.out.println(Character.isLowerCase('a'));      // true
        System.out.println(Character.toUpperCase('a'));      // 'A'
        System.out.println(Character.toLowerCase('Z'));      // 'z'
        System.out.println(Character.getNumericValue('9')); // 9

        // Boolean
        System.out.println(Boolean.parseBoolean("true"));   // true
        System.out.println(Boolean.parseBoolean("TRUE"));   // true (case-insensitive)
        System.out.println(Boolean.parseBoolean("sim"));    // false (só "true" retorna true)
        System.out.println(Boolean.toString(false));         // "false"
        System.out.println(Boolean.compare(true, false));   // 1
        System.out.println(Boolean.logicalAnd(true, false)); // false
        System.out.println(Boolean.logicalOr(true, false));  // true
        System.out.println(Boolean.logicalXor(true, true));  // false
    }
}
