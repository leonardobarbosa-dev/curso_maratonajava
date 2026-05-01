package com.leonardobarbosa.javastudy.exceptions.types.error;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {

        /*
        OutOfMemoryError= ocorre quando a JVM não consegue alocar memória
         */

        List<int[]> list = new ArrayList<>();

        while(true) {
            list.add(new int[1000000]);
        }
    }
}
