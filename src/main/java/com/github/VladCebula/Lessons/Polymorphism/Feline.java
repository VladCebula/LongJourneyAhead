package com.github.VladCebula.Lessons.Polymorphism;

public abstract class Feline extends Predator {
  @Override
  public String getFamily() {
    return "Feline";
  }

  @Override
  public void makeSound() {
    System.out.println("ROAR");
  }
}//kotowate family
