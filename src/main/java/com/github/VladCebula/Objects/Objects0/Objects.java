package com.github.VladCebula.Objects.Objects0;

import java.util.Scanner;

public class Objects {
  public static void main(String[] args){
  new GameLauncher().start();
  }
}

class GameLauncher{
  void start(){
    new GuessGame().startAutoGame();
    System.out.println("\n");
    new GuessGame().startGame();
  }
}

class GuessGame {
  private Player p1 = new Player();
  private Player p2 = new Player();
  private Player p3 = new Player();
  private int playerNumber;

  private void setPlayerNumber(int playerNumber) {
    if(playerNumber > 0) {
      this.playerNumber = playerNumber;
    }else {
      System.out.println("You have to play!");
      this.playerNumber = 1;
    }
  }

  void startAutoGame() {
    byte correctNumber = (byte) (Math.random() * 10);
    System.out.println(correctNumber);
    while (true) {
      System.out.println("Player 1 number is: " + p1.guess());
      System.out.println("Player 2 number is: " + p2.guess());
      System.out.println("Player 3 number is: " + p3.guess() + "\n");
      if (p1.getNumber() == correctNumber) {
        p1.setRight();
      }
      if (p2.getNumber() == correctNumber) {
        p2.setRight();
      }
      if (p3.getNumber() == correctNumber) {
        p3.setRight();
      }

      if (p1.isRight() || p2.isRight() || p3.isRight()) {
        System.out.println("We have a winner\n");
        System.out.println("Player 1 got it : " + p1.isRight());
        System.out.println("Player 2 got it : " + p2.isRight());
        System.out.println("Player 3 got it : " + p3.isRight());
        System.out.println("Game is over");
        break;
      } else {
        System.out.println("Guessing again!\n");
      }
    }
  }

   void startGame() {
     Scanner scan = new Scanner(System.in);
     System.out.println("Give me a player number: ");
     setPlayerNumber(scan.nextInt());

     Player[] playersList = new Player[playerNumber];

     byte correctNumber = (byte) (Math.random() * 10);

     exit: while (true) {

       for (int i = 0; i < playersList.length; i++) {
         playersList[i] = new Player();
         System.out.println("Player " + (i+1) + " guess is: " );
         playersList[i].setNumber(scan.nextByte());

         if (playersList[i].getNumber() == correctNumber) {
           playersList[i].setRight();
         }
       }
      System.out.println(" ");
       for (Player player : playersList) {
         if (player.isRight()) {
           System.out.println("---=== We have a winner ===---\n");
           for (int i = 0; i < playersList.length; i++) {
             System.out.println("Player " + (i + 1) + " got it: " + playersList[i].isRight());
           }
           System.out.println("\n  ---=== Game is over ===---");
           break exit;
         }
       }
       System.out.println("Guess again!\n");
     }
   }
}

class Player {
  private byte number = 0;
  private boolean right = false;

  byte getNumber() { return number; }
  byte guess(){ this.number = (byte) (Math.random() * 10); return this.number; }
  void setNumber(byte number) { this.number = number; }
  void setRight(){
    this.right = true;
  }
  boolean isRight(){
    return this.right;
  }
}