package com.github.VladCebula.Lessons.Polymorphism;

import com.github.VladCebula.Lessons.CONSTRUCTORS.Lion;

import java.util.Scanner;

class Menu{
  public static void main(String[] args){
    new Structure().printFirstMenu();
  }
}
class Structure {
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
      System.out.println("1.Tiger\n2.Wolf\n3.Zet\n4.Dog\n5.Cat\n6.Orangutan\n7.Lion\n8.Exit");
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
          System.out.println("Give me its name and age:");
          Animal lion = new Lion(scan.next(), scan.nextInt());
          animal.getAnimalArrayList().add(lion);
          System.out.println("Is it alive? y/n");
          if (scan.next().equals("n")) {
            lion.die();
          }
          System.out.println(lion.getName() + " added!\n");
        case 8:
          System.out.println("Closing . . .");
          workingAdd = false;
          break;
      }
    }
  }
}