package com.github.VladCebula.Lessons.Polymorphism;


interface Pet{
  void makeSound();
  boolean tamed();
}
interface Human{
  void makeSound();
}

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
  public void makeSound() {
    System.out.println("Woof");
  }

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
  @Override
  public void makeSound() {
    System.out.println("Meow");
  }

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


