package org.gkginfo.lecture;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval06 implements Sprite06 {
  private Color color;
  private int width;
  private int height;

  public Oval06(int width, int height, Color color) {
    this.width = width;
    this.height = height;
    this.color = color;
  }

  public void draw(Graphics surface, int x, int y) {
    surface.setColor(color);
    surface.fillOval(x, y, width, height);
    surface.setColor(Color.PINK);
    ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
    surface.drawOval(x, y, width, height);
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {

    return height;
  }
}
