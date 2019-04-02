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

  boolean isAlive() {
    return this.alive;
  }

  String getName() {
    return this.name;
  }

  abstract public void makeSound();

  abstract public void showInfo();
}
