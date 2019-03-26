package com.github.VladCebula.Lessons.Objects.Objects1;

public class Objects1 {
  public static void main(String[] args){
    // TODO:How Objects Behave PAGE:93 18.03.2019 - 21.03.2019
    new MachineTest().test();
    new EncapsulationTest().test();
  }
}
class MachineTest {
  void test() {
    new Machine().start();//default object in class
    Machine one = new Machine();
    Machine two = new Machine();
    Machine three = new Machine();
    one.sizeInKilos = 700; //set big size to object 1
    one.name = "Catepillar"; // name it
    two.sizeInKilos = 110;//do the same with different values
    two.name = "Washing machine";//and names to object 2 and 3
    three.sizeInKilos = 8;
    three.name = "Drill";

    one.start();//   *NOTICE*
    two.start();//  It prints values depending of size
    three.start();// of the object not whole class
  }
}
class Machine{
  protected int sizeInKilos = 0;
  String name = "null bitch";
  void start(){
    if(sizeInKilos > 600){
      System.out.println(name + ": WROOOM");
    }else if(sizeInKilos > 100 ){
      System.out.println(name + ": Wrrwrrrwrrrooom");
    }else {
      System.out.println(name + ": Brrrrrmmm");
    }
  }
}
class EncapsulationTest{
  void test(){
    GoodCat one = new GoodCat();
    GoodCat two = new GoodCat();
    one.setSize(90);
    one.setName("Pinky");
    two.setName("Lion");
    two.setSize(5);
    System.out.println(one.getName() + " has " + one.getSize() + "kg");
    System.out.println(two.getName() + " has " + two.getSize() + "kg");
    one.meow();
    two.meow();
  }
}
class GoodCat{
  private int size;
  private String name;

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  void meow(){
    if (size > 60){
      System.out.println(getName() + ": ROAAAR!");
    }else if(size > 8){System.out.println(getName() + ": Meow");}
    else{
      System.out.println(getName() +": miau");
    }
  }

}
