package com.github.VladCebula.BAATLESHIP;

import java.util.Scanner;

public class BATTLESHIPS {
  public static void main(String[] args){
    new SimpleShipGame().start();
    new TestShipGame().start();
  }
}

class SimpleShipGame{
  void start() {
    SimpleShip ship = new SimpleShip();
    Scanner scan = new Scanner(System.in);

    int numOfGuesses = 0;
    String result ="miss";
    int staringPoint = (int)(Math.random() * 5);
    int[] array = {staringPoint,staringPoint+1,staringPoint+2};

    ship.setLocationCells(array);

      while (!result.equals("kill")){

        System.out.println("enter a number: ");
        String userGuess = scan.next();
        result = ship.checkYourself(userGuess);
        numOfGuesses++;
      }

    System.out.println("Your score: " + ship.getScore()+" and number of guesses: " + numOfGuesses);
    scan.close();
  }
}

class TestShipGame{
  void start(){
    SimpleShip ship = new  SimpleShip();//instantiate a SimpleShip object

    int[] locations = {2,3,4};//make array for the locations 3 of 7
    ship.setLocationCells(locations);//invoke setter method on SimpleShip

    String userGuess = "2";//fake guess GET()
    String result = ship.checkYourself(userGuess);//check if hit
    String testResult ="failed";//fake result

    if(result.equals("hit")) {
      testResult = "passed";
      for (int i = 0; i <= 100; i++) {
        int staringPoint = (int) (Math.random() * 8);
        if(staringPoint == 8){
          System.out.println("FUCK ITS NOT");
          break;
        }
      }System.out.println("All GOOD");
      System.out.println(ship.getScore() + "\n" );//if gives hit it's working
    }
    System.out.println(testResult);
  }

}

class SimpleShip{
  private int[] locationCells;
  private int numOfHits = 0;
  private int score = 1000;

  String checkYourself(String stringGuess){
    int guess = Integer.parseInt(stringGuess);//Convert
    String result = "miss";
    for(int cell : locationCells){//REPEAT
      if(cell == guess){//COMPARE
        result ="hit";
        numOfHits++;
        score = score + 100;
        break;
      }else {score = score - 20;}
    }
    if(numOfHits == locationCells.length){
      result = "kill";
      score = score+500;
    }
    System.out.println(result);
    return result;
  }

  void setLocationCells(int[] locationCells) {
    this.locationCells = locationCells.clone();
  }

  int getScore() {
    return score;
  }
}
