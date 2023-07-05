package org.gkginfo.lecture;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics06
{
  ArrayList<Mover06> movers = new ArrayList<>();

  /** Initializes this class for drawing. */
  public DrawGraphics06()
  {
    movers.add(new Bouncer06(100, 170, new Rectangle06(15, 20, Color.RED)));
    movers.get(0).setMovementVector(3, 3);
    movers.add(new Bouncer06(150,150, new Oval06(20,30,Color.GREEN)));
    movers.get(1).setMovementVector(5, 5);
    movers.add(new StraightMover06(50, 70, new Rectangle06(15, 20, Color.PINK)));
    movers.get(2).setMovementVector(5, 0);
    movers.add(new StraightMover06(40, 40, new Oval06(20,30,Color.BLUE)));
    movers.get(3).setMovementVector(5, 1);
  }

  /** Draw the contents of the window on surface. */
  public void draw(Graphics surface)
  {
    for(Mover06 shape : movers)
    {
      shape.draw(surface);
    }

  }
}
