package com.github.VladCebula.Lessons.Polymorphism;

import java.util.ArrayList;

public abstract class Animal {
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

  protected String getSubtype() {
    return subtype;
  }

  protected String getClas() {
    return clas;
  }

  protected String getOrder() {
    return order;
  }

  protected String getFamily() {
    return family;
  }

  protected String getKind() {
    return kind;
  }

  protected String getType() {
    return type;
  }

  protected int getAge() {
    return age;
  }

  protected void setAge(int age) {
    this.age = age;
  }

  protected ArrayList<Animal> getAnimalArrayList() {
    return animalArrayList;
  }

  protected void setName(String name) {
    this.name = name;
  }

  protected void die() {
    this.alive = false;
  }

  protected boolean isAlive() {
    return this.alive;
  }

  protected String getName() {
    return this.name;
  }

  abstract public void makeSound();

  abstract public void showInfo();
}
