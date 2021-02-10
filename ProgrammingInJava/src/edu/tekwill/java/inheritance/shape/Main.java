package edu.tekwill.java.inheritance.shape;

/**
 * @author nsirbu
 * @since 10.02.2021
 */
public class Main {

  public static void main(String[] args) {
    Circle someCircle = new Circle(5);
    System.out.println("Circle area is: " + someCircle.calculateArea());

    Square someSquare = new Square(3);
    System.out.println("Square area is: " + someSquare.calculateArea());

    Sphere someSphere = new Sphere(8);
    System.out.println("Sphere area is: " + someSphere.calculateArea());
    System.out.println("Sphere volume is: " + someSphere.calculateVolume());

    Cube someCube = new Cube(6);
    System.out.println("Cube area is: " + someCube.calculateArea());
    System.out.println("Cube volume is: " + someCube.calculateVolume());
  }
}
