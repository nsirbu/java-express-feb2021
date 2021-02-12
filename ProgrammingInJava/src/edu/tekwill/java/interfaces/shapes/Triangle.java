package edu.tekwill.java.interfaces.shapes;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class Triangle extends Polygon {

  public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
    this.vertices.add(cornerOne);
    this.vertices.add(cornerTwo);
    this.vertices.add(cornerThree);
  }

  @Override
  public String toString() {
    return String.format("Triangle[%s]", vertices);
  }
}
