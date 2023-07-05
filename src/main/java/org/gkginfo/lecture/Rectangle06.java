package org.gkginfo.lecture;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle06 implements Sprite06 {
  private int width;
  private int height;
  private Color color;

  /** Create a box that has dimensions width and height, filled with startColor. */
  public Rectangle06(int width, int height, Color color) {
    this.width = width;
    this.height = height;
    this.color = color;
  }

  public void draw(Graphics surface, int x, int y) {
    // Draw the object
    surface.setColor(color);
    surface.fillRect(x, y, width, height);
    surface.setColor(Color.BLACK);
    ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
    surface.drawRect(x, y, width, height);
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}
