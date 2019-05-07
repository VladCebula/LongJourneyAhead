package com.github.VladCebula.Lessons.GUI;

import javax.sound.midi.*;
import java.awt.*;
import javax.swing.*;

public class FlowManagersTest {
  JFrame frame;
  JButton button;

  public static void main(String[] args) {
    FlowManagersTest flowManagersTest = new FlowManagersTest();
    flowManagersTest.go();
  }

  public void go() {
    frame = new JFrame();
    button = new JButton("Im for clicking");
    frame.getContentPane().add(BorderLayout.EAST, button);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);
  }
}
