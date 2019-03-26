package com.github.VladCebula.Lessons.BATTLESHIP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BATTLESHIPS {
  public static void main(String[] args){
   /* new SimpleShipGame().start();
   // new TestShipGame().start();*/
    ShipGame game = new ShipGame();
    game.setUpGame();
    game.startPlaying();

  }
}

/*class SimpleShipGame{
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
}*/

/*class TestShipGame{
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

}*/

class ShipGame{
private GameOperator operator = new GameOperator();
private ArrayList<Ship> shipList = new ArrayList<Ship>();
private int numOfGuesses = 0;
private int score = 1000;

  void setUpGame(){
    Ship shipA = new Ship();
    Ship shipB = new Ship();
    Ship shipC = new Ship();
    getShipList().add(shipA);
    getShipList().add(shipB);
    getShipList().add(shipC);

    System.out.println("SINK IT ALL! TYPE A-G 0-7");
      for(Ship object : getShipList()){
      ArrayList <String> newLocation = new GameOperator().placeDotCom();
      object.setLocationCells(newLocation);
      }
    }
  void startPlaying(){
    while (!getShipList().isEmpty()){
      String userGuess = getOperator().getUserInput("Enter guess");
      checkUsersGuess(userGuess);
    }
    finishGame();
  }
  void checkUsersGuess(String userGuess){
    numOfGuesses = getNumOfGuesses() + 1;
    String result = "miss";
    for(Ship shipTest : getShipList()){
      result = shipTest.checkYourself(userGuess);
      if (result.equals("kill")){
        getShipList().remove(shipTest);
        score = getScore() + 500;
        break;
      }
      if(result.equals("hit")){score = getScore() + 100;break;}
      if (result.equals("miss")){score = getScore() - (int)(Math.random() * 20);}
    }//close for
    System.out.println(result);
  }
  void finishGame(){
    if(getNumOfGuesses() > 18){System.out.println("Insult and score: " + getScore());}
    else {System.out.println("Approval and score: " + getScore());}
  }

  private GameOperator getOperator() {
    return operator;
  }

  private ArrayList<Ship> getShipList() {
    return shipList;
  }

  private int getNumOfGuesses() {
    return numOfGuesses;
  }

  private int getScore() {
    return score;
  }
}

/*class SimpleShip{
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
}*/

class Ship{
  private ArrayList<String> locationCells;
  //private int score;

  void setLocationCells(ArrayList<String> locationCells) {
    this.locationCells = locationCells;
  }

  String checkYourself(String userInput){
    String result = "miss";
    int index = locationCells.indexOf(userInput);//Ask if user guess is in array

    if(index >= 0){//If index is greater than or equal to zero the user guess
                   // is definitely there
      locationCells.remove(index);//so remove it

      if(locationCells.isEmpty()){//if ship is gone print kill and add points
        //score = score+500;
        result ="kill";
      }else {
        //score = score + 100;
        result = "hit";
      }
    }//else{score = (score - 20);}
    return result;
  }
}

class GameOperator{
  private static final String alphabet = "abcdefg";
  private int gridSize = 49;
  private int[] grid = new int[gridSize];
  private int comCount = 0;

  String getUserInput(String prompt){
    String inputLine = null;
    System.out.println(prompt + " ");
      try{
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        inputLine = is.readLine();
      }catch (IOException e){System.out.print("IOException " + e);}
    assert inputLine != null;
    if(inputLine.length() == 0) return null;
    return inputLine.toLowerCase();
  }

  ArrayList<String> placeDotCom(){
    ArrayList<String> alphaCells = new ArrayList<String>();
    String[] alphacords = new String[3]; //holds end cords
    String temp;
    int [] cords = new int[3];
    int attepts = 0;
    boolean succes = false;
    int location;

    comCount++;
    int increment = 1;
    int gridLength = 7;
    if((comCount % 2) == 1){increment = gridLength;}
      while (!succes & attepts++ <200){
       location = (int)(Math.random() * gridSize);
       int x = 0;
       succes = true;
        while (succes && x < 3){
         if (grid[location] == 0){
           cords[x++] = location;
           location += increment;
           if(location >=gridSize){
           succes = false;
           }
           if(x>0 && (location % gridLength == 0)){
           succes = false;
           }
         }else {
           System.out.println("Used " + location);succes = false;}
        }
      }

      int x = 0;
      int row;
      int column;
      while (x < 3){
        grid[cords[x]] = 1;
        row = cords[x] / gridLength;
        column = cords[x] % gridLength;
        temp = String.valueOf(alphabet.charAt(column));
        alphaCells.add(temp.concat(Integer.toString(row)));
        x++;
       // System.out.println("  cord " + x +" = " + alphaCells.get(x-1));
      }
      return alphaCells;
  }
}
