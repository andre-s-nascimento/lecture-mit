package org.gkginfo.lecture;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
  ArrayList<BouncingBox> boxes;

  public DrawGraphics() {
    boxes = new ArrayList<>();

    boxes.add(new BouncingBox(200, 50, Color.GREEN));
    boxes.get(0).setMovementVector(1, 3);

    boxes.add(new BouncingBox(100, 100, Color.BLUE));
    boxes.get(1).setMovementVector(3, 5);

    boxes.add(new BouncingBox(50, 50, Color.CYAN));
    boxes.get(2).setMovementVector(6, 6);
  }

  /** Draw the contents of the window on surface. Called 20 times per second. */
  public void draw(Graphics surface) {
    surface.drawLine(50, 50, 250, 250);

    surface.drawOval(20, 20, 50, 50);
    surface.drawRect(20, 100, 15, 60);
    surface.drawArc(100, 30, 40, 40, 20, 30);

    for (BouncingBox box : boxes) {
      box.draw(surface);
    }
  }
}
