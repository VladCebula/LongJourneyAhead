package com.github.VladCebula.Lessons.Polymorphism;

public abstract class Hominid extends Primate {
  @Override
  public String getFamily() {
    return "Hominid";
  }

  @Override
  public void makeSound() {
    System.out.println("UUUK");
  }
}//czlowiekowate family
