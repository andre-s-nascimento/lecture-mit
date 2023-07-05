package org.gkginfo.lecture;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Lecture05 {
  public static void main(String args[]) {
    final SimpleDraw content = new SimpleDraw(new DrawGraphics());

    JFrame frame = new JFrame("Graphics!");

    Color bgColor = Color.white;
    frame.setBackground(bgColor);
    content.setBackground(bgColor);

    content.setPreferredSize(new Dimension(SimpleDraw.WIDTH, SimpleDraw.HEIGHT));

    frame.setContentPane(content);
    frame.setResizable(false);
    frame.pack();
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) { System.exit(0); }
      public void windowDeiconified(WindowEvent e) { content.start(); }
      public void windowIconified(WindowEvent e) { content.stop(); }
    });

    new Thread(content).start();

    frame.setVisible(true);
  }
}
