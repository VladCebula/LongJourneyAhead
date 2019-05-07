package com.github.VladCebula.Lessons.CONSTRUCTORS;

import com.github.VladCebula.Lessons.Polymorphism.Feline;

public class Lion extends Feline {
  public Lion(String name, int age) {
    super.setName(name);
    super.setAge(age);
  }

  public Lion() {
  }

  public Lion(String name) {
    super.setName(name);
  }

  @Override
  protected String getKind() {
    return "Lion";
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
}
