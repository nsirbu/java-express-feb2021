package edu.tekwill.java.inheritance.shape;

/**
 * @author nsirbu
 * @since 10.02.2021
 */
public class Sphere extends ThreeDimensionalShape {

  private int radius;

  public Sphere(int radius) {
    this.radius = radius;
  }

  @Override
  public double calculateVolume() {
    return (4 / 3d) * Math.PI * Math.pow(radius, 3);
  }

  @Override
  public double calculateArea() {
//    return 4 * Math.PI * Math.pow(radius, 2);
    return 4 * Math.PI * radius * radius;
  }
}
