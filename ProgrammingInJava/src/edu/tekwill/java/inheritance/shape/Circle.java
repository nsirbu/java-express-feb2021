package edu.tekwill.java.inheritance.shape;

/**
 * @author nsirbu
 * @since 10.02.2021
 */
public class Circle extends TwoDimensionalShape {

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
