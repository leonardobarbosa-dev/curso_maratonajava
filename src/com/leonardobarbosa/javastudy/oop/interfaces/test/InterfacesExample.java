package com.leonardobarbosa.javastudy.oop.interfaces.test;

import com.leonardobarbosa.javastudy.oop.interfaces.domain.DataLoader;
import com.leonardobarbosa.javastudy.oop.interfaces.domain.DatabaseLoader;
import com.leonardobarbosa.javastudy.oop.interfaces.domain.FileLoader;

public class InterfacesExample {
    public static void main(String[] args) {

        DatabaseLoader dataBaseLoader = new DatabaseLoader();
        dataBaseLoader.load();
        dataBaseLoader.checkPermission();

        /*
        ------------------------------------------------------------
         */

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.checkPermission();

        /*
        ------------------------------------------------------------
         */

        DataLoader.retrieveMaxDataSize();
        System.out.println(DataLoader.MAX_DATA_SIZE);
    }
}
