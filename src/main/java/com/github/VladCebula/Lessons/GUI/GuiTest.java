package com.github.VladCebula.Lessons.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTest implements ActionListener {
  JButton button;
  JFrame frame;

  public static void main(String[] args) {
    GuiTest gui = new GuiTest();
    gui.go();
  }

  public void go() {
    frame = new JFrame();
    MessingAround mess = new MessingAround();
    button = new JButton("Click bitch");
    button.addActionListener(this);

    frame.getContentPane().add(BorderLayout.SOUTH, button);
    frame.getContentPane().add(BorderLayout.CENTER, mess);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    frame.repaint();
  }
}
