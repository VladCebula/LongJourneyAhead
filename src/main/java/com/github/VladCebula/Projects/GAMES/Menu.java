package com.github.VladCebula.Projects.GAMES;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu {
  private JFrame frame;
  private JMenuBar menuBar;
  private JMenu menu;
  private JPanel mainPanel;
  private Box box;
  private String[] games = {"-==Choose Game==-", "Slot", "TicTacToe", "Ships", "..."};
  private JComboBox comboBox;

  Menu() {
    frame = new JFrame("Game Menu");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    BorderLayout layout = new BorderLayout();
    JPanel background = new JPanel(layout);
    background.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
    box = new Box(BoxLayout.Y_AXIS);
    comboBox = new JComboBox(games);
    box.add(comboBox);
    JButton confirm = new JButton("Confirm");
    confirm.addActionListener(new ConfirmActionListener());
    box.add(confirm);
    mainPanel = new JPanel();
    mainPanel.add(box);

    background.add(BorderLayout.CENTER, mainPanel);
    frame.setContentPane(background);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  public void gameChanger() {
    int choice = comboBox.getSelectedIndex();
    switch (choice) {
      case 0:
        System.out.println("CHOOSE");
        break;
      case 1:
        System.out.println("SLOT");
        new Spin().SetGame();
        frame.dispose();
        break;
      case 2:
        System.out.println("TicTacToe");
        break;
      case 3:
        System.out.println("3");
        break;
      case 4:
        System.out.println("4");
        break;
      default:
        System.out.println("Error! unknown value");
    }
  }

  public static void main(String[] args) {
    new Menu();
  }

  public class ConfirmActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      gameChanger();
    }
  }
}