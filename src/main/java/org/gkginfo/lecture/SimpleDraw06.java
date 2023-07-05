package org.gkginfo.lecture;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class SimpleDraw06 extends JPanel implements Runnable {
  private boolean animate = true;
  private final int FRAME_DELAY = 50; // 50 ms = 20 FPS
  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;
  private final DrawGraphics06 draw;


  public SimpleDraw06(DrawGraphics06 drawer) {
    this.draw = drawer;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    draw.draw(g2);
  }

  public synchronized void start() {
    animate = true;
  }

  public synchronized void stop() {
    animate = false;
  }

  private synchronized boolean animationEnabled() {
    return animate;
  }

  public void run() {
    while (true) {
      if (animationEnabled()) {
        repaint();
      }

      try {
        Thread.sleep(FRAME_DELAY);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }


}