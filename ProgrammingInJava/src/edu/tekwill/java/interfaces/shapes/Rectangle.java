package edu.tekwill.java.interfaces.shapes;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class Rectangle extends Polygon {

  public Rectangle(Point topRightCorner, int width, int height) {
    Point topLeftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY());
    Point bottomLeftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY() - height);
    Point bottomRightCorner = new Point(topRightCorner.getX(), topRightCorner.getY() - height);

    this.vertices.add(topRightCorner);
    this.vertices.add(topLeftCorner);
    this.vertices.add(bottomRightCorner);
    this.vertices.add(bottomLeftCorner);
  }

  @Override
  public String toString() {
    return String.format("Rectangle[%s]", vertices);
  }
}
