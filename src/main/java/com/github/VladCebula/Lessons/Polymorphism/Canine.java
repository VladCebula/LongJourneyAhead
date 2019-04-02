package com.github.VladCebula.Lessons.Polymorphism;

public abstract class Canine extends Predator {
  @Override
  public String getFamily() {
    return "Canine";
  }

  @Override
  public void makeSound() {
    System.out.println("HOWL");
  }
}//psowate family
