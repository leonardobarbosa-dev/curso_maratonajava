package com.leonardobarbosa.javastudy.oop.methods.test;

import com.leonardobarbosa.javastudy.oop.methods.domain.PrintMethods;

public class PrintMethodsExample {
    public static void main(String[] args) {

        PrintMethods girl = new PrintMethods();
        girl.name = "Sakura";
        girl.age = 19;
        girl.sex = 'F';
        girl.print();


        PrintMethods boy = new PrintMethods();
        boy.name = "Kakashi";
        boy.age = 37;
        boy.sex = 'M';
        boy.print();


        PrintMethods printer  = new PrintMethods();
        printer.printStudent(girl);
        printer.printStudent(boy);

    }
}
