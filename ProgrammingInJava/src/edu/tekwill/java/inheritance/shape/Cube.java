package edu.tekwill.java.inheritance.shape;

/**
 * @author nsirbu
 * @since 10.02.2021
 */
public class Cube extends ThreeDimensionalShape {

  private int sideLength;

  public Cube(int sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double calculateVolume() {
    return Math.pow(sideLength, 3);
  }

  @Override
  public double calculateArea() {
    return 6 * Math.pow(sideLength, 2);
  }
}
