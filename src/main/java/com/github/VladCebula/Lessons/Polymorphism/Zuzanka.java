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

class Testing{
  public static void main(String[] args){
    new Menu().printFirstMenu();
  }
}
class Menu {
  private Animal animal = new Animal() {
    @Override
    public void makeSound() {}

    @Override
    public void showInfo() {}
  };
  private Scanner scan = new Scanner(System.in);
  private boolean workingMain = true;
  private boolean workingAdd = true;
  void printFirstMenu(){
    while (workingMain) {
      System.out.println("\nWhat you want to do: ");
      System.out.println("1.Add animal(COMING SOON!)");
      System.out.println("2.See list");
      System.out.println("3.Exit program");
      switch (scan.nextInt()) {
        case 1:
          this.addList();
        case 2:
          this.printList();
          break;
        case 3:
          System.out.println("Closing!");
          workingMain = false;
          break;
        default:
          System.out.println("Error! Invalid command! Try 1. 2. 3.!\n");

      }
    }scan.close();
  }
  private void printList(){
      System.out.println("All animals in System: \n");
      new Zuzanka().showInfo();
      for (Animal test:animal.getAnimalArrayList()){
        test.showInfo();
      }
  }
  private void addList(){
    //System.out.println("Sorry option coming soon! Try when correct update comes!\n");
    while (workingAdd){
    System.out.println("What you wanna add?: ");
    System.out.println("1.Tiger\n2.Wolf\n3.Zet\n4.Dog\n5.Cat\n6.Orangutan\n7.Exit");
      switch (scan.nextInt()){
        default:
          System.out.println("Error! Invalid Command! Try correct number!\n");
        case 1:
          Animal tiger = new Tiger();
          animal.getAnimalArrayList().add(tiger);
          System.out.println("Give me its name: ");
          tiger.setName(scan.next());
          System.out.println("Give me its age: ");
          tiger.setAge(scan.nextInt());
          System.out.println("Is it alive? y/n");
          if(scan.next().equals("n")){tiger.die();}
          System.out.println(tiger.getName() + " added!\n");
          break;
        case 2:
          Animal wolf = new Wolf();
          animal.getAnimalArrayList().add(wolf);
          System.out.println("Give me its name: ");
          wolf.setName(scan.next());
          System.out.println("Give me its age: ");
          wolf.setAge(scan.nextInt());
          System.out.println("Is it alive? y/n");
          if(scan.next().equals("n")){wolf.die();}
          System.out.println(wolf.getName() + " added!\n");
          break;
        case 3:
          System.out.println("You can't add another because there is only one Zuzka!");
          break;
        case 4:
          Animal dog = new Dog();
          animal.getAnimalArrayList().add(dog);
          System.out.println("Give me its name: ");
          dog.setName(scan.next());
          System.out.println("Give me its age: ");
          dog.setAge(scan.nextInt());
          System.out.println("Is it alive? y/n");
          if(scan.next().equals("n")){dog.die();}
          System.out.println(dog.getName() + " added!\n");
          break;
        case 5:
          Animal cat = new Cat();
          animal.getAnimalArrayList().add(cat);
          System.out.println("Give me its name: ");
          cat.setName(scan.next());
          System.out.println("Give me its age: ");
          cat.setAge(scan.nextInt());
          System.out.println("Is it alive? y/n");
          if(scan.next().equals("n")){cat.die();}
          System.out.println(cat.getName() + " added!\n");
          break;
        case 6:
          Animal orangutan = new Orangutan();
          animal.getAnimalArrayList().add(orangutan);
          System.out.println("Give me its name: ");
          orangutan.setName(scan.next());
          System.out.println("Give me its age: ");
          orangutan.setAge(scan.nextInt());
          System.out.println("Is it alive? y/n");
          if(scan.next().equals("n")){orangutan.die();}
          System.out.println(orangutan.getName() + " added!\n");
          break;
        case 7:
          System.out.println("Closing . . .");
          workingAdd = false;
          break;
      }
    }
  }
}
