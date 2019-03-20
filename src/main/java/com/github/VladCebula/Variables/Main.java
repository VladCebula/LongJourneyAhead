package com.github.VladCebula.Variables;

public class Main {
  public static void main(String[] args){
    //Car object and accessing it
    Car car = new Car();
    car.start();
    car.name = "Polonez";
    // Car reference Array
    Car[] cars = new Car[3];
    //put som car objects in
    cars[0] = new Car();
    cars[1] = new Car();
    cars[2] = car;
    //access Cars using array references
    cars[0].name = "Ferrari";
    cars[1].name = "Golf";
    //print last car name
    System.out.println("Last car name is " + cars[2].name);
    //loop through array and start cars
    for (int i = 0;i<cars.length;++i){
      cars[i].start();
    }
  }
}

class Car{
  String name;
  void start(){
    System.out.println(name + " goes wrooom!");
  }
}
