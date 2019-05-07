package com.github.VladCebula.Projects.GAMES;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Spin {
  private JButton addButton;
  private JButton takeButton;
  private JPanel panel1;
  private JButton playButton;
  private JButton endButton;
  private JLabel Num1Label;
  private JLabel Num3Label;
  private JLabel Num2Label;
  private JLabel NumOfCoinsLabel;
  private JLabel NumOfMoneyLabel;
  private JLabel ActionCommentLabel;
  private int num1;
  private int num2;
  private int num3;
  private int coins;
  private int money;

  public static void main(String[] args) {
    JFrame frame = new JFrame("Slot");
    frame.setContentPane(new Spin().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

  public void SetGame() {
    final JFrame frame = new JFrame("Slot");
    frame.setContentPane(new Spin().panel1);
    frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    frame.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        if (JOptionPane.showConfirmDialog(frame, "Are you sure?") == JOptionPane.OK_OPTION) {
          new Menu().gameChanger();
          frame.dispose();
        }
      }
    });
    frame.pack();
    frame.setSize(480, 300);
    frame.setVisible(true);

  }

  public Spin() {
    coins = 5;
    money = 1000;
    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //increase coin number
        //take 100 from money
        if (money > -200) {
          coins += 1;
          money -= 100;
          NumOfCoinsLabel.setText(String.valueOf(coins));
          NumOfMoneyLabel.setText(String.valueOf(money));
          ActionCommentLabel.setText("Added 1 coin!");
        } else {
          ActionCommentLabel.setText("Can't take more coins!");
        }
      }
    });
    takeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //decrease coin number
        //add 100 from money
        if (coins > 0) {
          coins -= 1;
          money += 100;
          NumOfCoinsLabel.setText(String.valueOf(coins));
          NumOfMoneyLabel.setText(String.valueOf(money));
          ActionCommentLabel.setText("Added 100 money!");
        } else {
          ActionCommentLabel.setText("You don't have any more coins!");
        }
      }
    });
    playButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //make random numbers and change labels
        //if 3 are the same add
        if (coins > 0) {
          num1 = (int) ((Math.random() * 9) + 1);
          num2 = (int) ((Math.random() * 9) + 1);
          num3 = (int) ((Math.random() * 9) + 1);
          coins -= 1;
          NumOfCoinsLabel.setText(String.valueOf(coins));
          Num1Label.setText(String.valueOf(num1));
          Num2Label.setText(String.valueOf(num2));
          Num3Label.setText(String.valueOf(num3));

          if (num1 == num2 & num2 == num3) {
            money += 1000;
            ActionCommentLabel.setText("Win!");
            NumOfMoneyLabel.setText(String.valueOf(money));
          } else if (num1 == 7 && num2 == 7 && num3 == 7) {
            money += 10000;
            ActionCommentLabel.setText("Jackpot!!!");
            NumOfMoneyLabel.setText(String.valueOf(money));
          } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            money += 300;
            ActionCommentLabel.setText("Almost!");
            NumOfMoneyLabel.setText(String.valueOf(money));
          } else {
            ActionCommentLabel.setText("Try again!");
          }
        } else {
          ActionCommentLabel.setText("Add more coins!");
        }
      }
    });
    endButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("SAVE");
        System.exit(-1);
        //Safe .txt file later make server json file and print score board
      }
    });
  }
}
