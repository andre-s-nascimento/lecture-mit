package org.gkginfo.lecture;

import java.awt.Graphics;

public class Bouncer06 implements Mover06 {
  private int x;
  private int y;
  private int xDirection;
  private int yDirection;
  private Sprite06 sprite;

  public Bouncer06(int startX, int startY, Sprite06 sprite) {
    x = startX;
    y = startY;
    this.sprite = sprite;
  }

  public void setMovementVector(int xIncrement, int yIncrement) {
    xDirection = xIncrement;
    yDirection = yIncrement;
  }

  public void draw(Graphics surface) {

    sprite.draw(surface, x, y);

    x += xDirection;
    y += yDirection;

    if ((x <= 0 && xDirection < 0)
        || (x + sprite.getWidth() >= SimpleDraw06.WIDTH && xDirection > 0)) {
      xDirection = -xDirection;
    }
    if ((y <= 0 && yDirection < 0)
        || (y + sprite.getHeight() >= SimpleDraw06.HEIGHT && yDirection > 0)) {
      yDirection = -yDirection;
    }
  }
}
