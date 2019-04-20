package com.github.VladCebula.Lessons.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTest {
  JButton button;
  JFrame frame;
  JLabel label;

  public static void main(String[] args) {
    GuiTest gui = new GuiTest();
    gui.go();
  }

  public void go() {
    frame = new JFrame();
    MessingAround mess = new MessingAround();
    label = new JLabel("Why so serious?");
    button = new JButton("Click bitch");
    JButton labelbutton = new JButton("Change label");
    button.addActionListener(new ColorListener());
    labelbutton.addActionListener(new LabelListener());
    frame.getContentPane().add(BorderLayout.SOUTH, button);
    frame.getContentPane().add(BorderLayout.CENTER, mess);
    frame.getContentPane().add(BorderLayout.EAST, labelbutton);
    frame.getContentPane().add(BorderLayout.WEST, label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    frame.setVisible(true);
  }

  class LabelListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      label.setText("HAHAHAHAHAHAH");
    }
  }

  class ColorListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      frame.repaint();
    }
  }
}
