package edu.tekwill.java.interfaces.shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public abstract class Polygon implements IMovable {

  protected List<Point> vertices;

  protected Polygon() {
    this.vertices = new ArrayList<>();
  }

  @Override
  public void moveUp(int distance) {
    for (Point corner : vertices) {
      corner.setY(corner.getY() + distance);
    }
  }

  @Override
  public void moveDown(int distance) {
    for (Point corner : vertices) {
      corner.setY(corner.getY() - distance);
    }
  }

  @Override
  public void moveLeft(int distance) {
    for (Point corner : vertices) {
      corner.setX(corner.getX() - distance);
    }
  }

  @Override
  public void moveRight(int distance) {
    for (Point corner : vertices) {
      corner.setX(corner.getX() + distance);
    }
  }
}
