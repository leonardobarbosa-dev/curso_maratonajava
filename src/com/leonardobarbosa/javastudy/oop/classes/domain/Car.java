package com.leonardobarbosa.javastudy.oop.classes.domain;

public class Car {

   public String name;
   public String model;
   public int year;
   public String color;

   @Override
   public String toString() {
      return String.format("Carro: %s - Modelo: %s - Ano de fabricação: %d - Cor: %s"
      , name, model, year, color);
   }
}
