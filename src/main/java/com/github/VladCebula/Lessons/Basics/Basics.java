package com.github.VladCebula.Lessons.Basics;

public class Basics {
  public static void main(String[] args){
    BeerSong beerSong = new BeerSong();
    beerSong.start();
    PraseOmatic phrase = new PraseOmatic();
    phrase.start();
  }
}

class BeerSong{
  private int beerNum = 99;
  private String word = "bottles";
  void start(){
    while (beerNum > 0){

      if (beerNum == 1){
        word = "bottle";
      }

      System.out.println("There is " + beerNum + " " + word + " on the wall!");
      System.out.println("Pass one around");
      beerNum--;

    }

    System.out.println("There is no bottles on the wall\n Go to shop :)");
  }
}

class PraseOmatic{
  void start(){
    String[] wordList1 = {"24/7","Multi Functional","Godlike","Humanoid","Moon","Boomer","Glowing","Dynamic"};
    String[] wordList2 ={"solar-powered","mainstream","gender","oriented","based","wild born","smart","polluted"};
    String[] wordList3 ={"shape","hipster","PETA activist","Moon","cluster","Millenial"};
    int rand1 = (int) (Math.random() * wordList1.length);
    int rand2 = (int) (Math.random() * wordList2.length);
    int rand3 = (int) (Math.random() * wordList3.length);
    String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
    System.out.println("What we need is " + phrase + "!");
  }
}

