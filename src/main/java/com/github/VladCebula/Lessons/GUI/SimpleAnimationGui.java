package com.github.VladCebula.Lessons.GUI;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimationGui {
  private int x = 85;
  private int y = 85;

  public static void main(String[] args) {
    SimpleAnimationGui gui = new SimpleAnimationGui();
    gui.makeShit();
  }

  public void makeShit() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    DrawShit drawShit = new DrawShit();

    frame.getContentPane().add(drawShit);
    frame.setSize(500, 500);
    frame.setVisible(true);

    for (int i = 0; i < 250; i++) {
      x++;
      y++;
      drawShit.repaint();
      try {
        Thread.sleep(10);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

  }

  class DrawShit extends JPanel {
    public void paintComponent(Graphics g) {
      g.setColor(Color.black);
      g.fillOval(x - 1, y - 1, 40, 40);

      g.setColor(Color.red);
      g.fillOval(x, y, 40, 40);
    }
  }
}
