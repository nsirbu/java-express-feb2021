package edu.tekwill.java.inheritance.shape;

/**
 * @author nsirbu
 * @since 10.02.2021
 */
public class Square extends TwoDimensionalShape {

  private int sideLength;

  public Square(int sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double calculateArea() {
    return sideLength * sideLength;
  }
}
