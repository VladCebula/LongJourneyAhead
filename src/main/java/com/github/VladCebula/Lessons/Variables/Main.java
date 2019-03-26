package com.github.VladCebula.Lessons.Variables;

public class Main {
  public static void main(String[] args){
    //Car object and accessing it
    Car car = new Car();
    car.start();
    car.setName("Polonez");
    // Car reference Array
    Car[] cars = new Car[3];
    //put som car objects in
    cars[0] = new Car();
    cars[1] = new Car();
    cars[2] = car;
    //access Cars using array references
    cars[0].setName("Ferrari");
    cars[1].setName("Golf");
    //print last car name
    System.out.println("Last car name is " + cars[2].getName());
    //loop through array and start cars
    for (Car car1 : cars) {
      car1.start();
    }
  }
}

class Car{
  private String name;
  void start(){
    System.out.println(getName() + " goes wrooom!");
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}
