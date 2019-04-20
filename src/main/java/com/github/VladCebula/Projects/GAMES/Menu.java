package com.github.VladCebula.Projects.GAMES;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Menu {
  private JFrame frame;
  private JMenuBar menuBar;
  private JMenu menu;
  private JPanel mainPanel;
  private JPanel bottomPanel;
  private Box buttonBox;

  String[] GAMES = {"-==Please Choose==-", "Spin Game", "2", "3",};

  Menu() {
    frame = new JFrame("Games Menu");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    BorderLayout layout = new BorderLayout();
    JPanel background = new JPanel(layout);
    background.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
    JComboBox comboBox = new JComboBox(GAMES);
    JButton confirm = new JButton("Confirm");
    confirm.addActionListener(new ConfirmActionListener());

    comboBox.setBounds(300, 300, 200, 100);
    confirm.setBounds(35, 10, 10, 50);
    frame.add(comboBox);
    frame.add(confirm);

    frame.setSize(800, 600);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new Menu();
  }

  public class ConfirmActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    }
  }
}