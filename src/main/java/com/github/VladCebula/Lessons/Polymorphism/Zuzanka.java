package com.github.VladCebula.Lessons.Polymorphism;



import java.util.ArrayList;
import java.util.Scanner;

interface Pet{
  void makeSound();
  boolean tamed();
}
interface Human{
  void makeSound();
}

abstract class Animal{
private boolean alive = true;
private String name = null;
private String kind = null;
private String type = null;
private String subtype = null;
private String clas = null;
private String order = null;
private String family = null;
private int age;
private ArrayList<Animal> animalArrayList = new ArrayList<Animal>();

  String getSubtype() {
    return subtype;
  }

  String getClas() {
    return clas;
  }

  String getOrder() {
    return order;
  }

  String getFamily() {
    return family;
  }

  String getKind() {
    return kind;
  }

  String getType() {
    return type;
  }

  int getAge() {
    return age;
  }

  void setAge(int age) {
    this.age = age;
  }

  ArrayList<Animal> getAnimalArrayList() {
    return animalArrayList;
  }

  void setName(String name) {
    this.name = name;
  }

  void die() {
    this.alive = false;
  }

  boolean isAlive() { return this.alive; }

  String getName() {
    return this.name;
  }

  abstract public void makeSound();
  abstract public void showInfo();

}//zwierze kingdom
abstract class Chordate extends Animal{
  @Override
  public String getType() {
    return "Chordate";
  }
}//strunowce type
abstract class Vertebrate extends Chordate{

  @Override
  public String getSubtype() {
    return "Vertebrate";
  }

  public boolean hasBones(){//info example
    return true;}
}//kręgowce subtype
abstract class Mammal extends Vertebrate{
  @Override
  public String getClas() {
    return "Mammal";
  }
}//ssaki class
abstract class Primate extends Mammal{
  @Override
  public String getOrder() {
    return "Primate";
  }
}//naczelne order
abstract class Predator extends Mammal{
  @Override
  public String getOrder() {
    return "Predator";
  }
}//drapiezne order
abstract class Hominid extends Primate{
  @Override
  public String getFamily() {
    return "Hominid";
  }

  @Override
  public void makeSound() {
    System.out.println("UUUK");
  }
}//czlowiekowate family
abstract class Feline extends Predator{
  @Override
  public String getFamily() {
    return "Feline";
  }

  @Override
  public void makeSound() {
    System.out.println("ROAR");
  }
}//kotowate family
abstract class Canine extends Predator{
  @Override
  public String getFamily() {
    return "Canine";
  }

  @Override
  public void makeSound() {
    System.out.println("HOWL");
  }
}//psowate family
class Tiger extends Feline {
  @Override
  public String getKind() {
    return "Tiger";
  }

  @Override
  public void showInfo() {
    System.out.println("\nIts name: " + getName());
    System.out.println("Is alive? " + isAlive());
    System.out.println("Type: " + getType());
    System.out.println("Subtype: " + getSubtype());
    System.out.println("Class: " + getClas());
    System.out.println("Order: " + getOrder());
    System.out.println("Family: " + getFamily());
    System.out.println("Kind: " + getKind());
  }
}//tygrys
class Wolf extends Canine{
  @Override
  public String getKind() {
    return "Wolf";
  }

  @Override
  public void showInfo() {

    System.out.println("\nIts name: " + getName());
    System.out.println("Is alive? " + isAlive());
    System.out.println("Type: " + getType());
    System.out.println("Subtype: " + getSubtype());
    System.out.println("Class: " + getClas());
    System.out.println("Order: " + getOrder());
    System.out.println("Family: " + getFamily());
    System.out.println("Kind: " + getKind());
  }
}//wilk
class Zuzanka extends Hominid implements Human {
  @Override
  public void makeSound() {
    System.out.println("Sweet sound");
  }

  @Override
  public String getKind() {
    return "One of it's own :)";
  }

  @Override
  public void showInfo() {

    System.out.println("\nIts name: " + getName());
    System.out.println("Is alive? " + isAlive());
    System.out.println("Type: " + getType());
    System.out.println("Subtype: " + getSubtype());
    System.out.println("Class: " + getClas());
    System.out.println("Order: " + getOrder());
    System.out.println("Family: " + getFamily());
    System.out.println("Kind: " + getKind());
  }
}//kotek<3
class Dog extends Canine implements Pet{
  public boolean tamed() {
    return true;
  }

  @Override
  public String getKind() {
    return "Dog";
  }

  @Override
  public void showInfo() {

    System.out.println("\nIts name: " + getName());
    System.out.println("Its age: " + getAge());
    System.out.println("Is alive? " + isAlive());
    System.out.println("Type: " + getType());
    System.out.println("Subtype: " + getSubtype());
    System.out.println("Class: " + getClas());
    System.out.println("Order: " + getOrder());
    System.out.println("Family: " + getFamily());
    System.out.println("Kind: " + getKind());
    System.out.println("Is tamed: " + tamed());
  }
}//pies
class Cat extends Feline implements Pet{
  public boolean tamed() {
    return true;
  }

  @Override
  public String getKind() {
    return "Cat";
  }

  @Override
  public void showInfo() {

    System.out.println("\nIts name: " + getName());
    System.out.println("Is alive? " + isAlive());
    System.out.println("Type: " + getType());
    System.out.println("Subtype: " + getSubtype());
    System.out.println("Class: " + getClas());
    System.out.println("Order: " + getOrder());
    System.out.println("Family: " + getFamily());
    System.out.println("Kind: " + getKind());
    System.out.println("Is tamed: " + tamed());
  }
}//kot
class Orangutan extends Hominid{
  @Override
  public String getKind() {
    return "Orangutan";
  }

  @Override
  public void showInfo() {

    System.out.println("\nIts name: " + getName());
    System.out.println("Is alive? " + isAlive());
    System.out.println("Type: " + getType());
    System.out.println("Subtype: " + getSubtype());
    System.out.println("Class: " + getClas());
    System.out.println("Order: " + getOrder());
    System.out.println("Family: " + getFamily());
    System.out.println("Kind: " + getKind());
  }
}//orangutan


