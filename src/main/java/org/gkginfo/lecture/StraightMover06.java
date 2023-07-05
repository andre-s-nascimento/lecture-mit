package org.gkginfo.lecture;

import java.awt.Graphics;

public class StraightMover06 implements Mover06 {
  private int x;
  private int y;
  private int xDirection;
  private int yDirection;
  private Sprite06 sprite;

  /** Create a Bouncer that positions sprite at (startX, startY). */
  public StraightMover06(int startX, int startY, Sprite06 sprite) {
    x = startX;
    y = startY;
    this.sprite = sprite;
  }

  /** Starts moving the object in the direction (xIncrement, yIncrement). */
  public void setMovementVector(int xIncrement, int yIncrement) {
    xDirection = xIncrement;
    yDirection = yIncrement;
  }

  public void draw(Graphics graphics) {
    sprite.draw(graphics, x, y);

    // Move the center of the object each time we draw it
    x += xDirection;
    y += yDirection;
  }
}
