package edu.tekwill.java.inheritance.shape;

/**
 * @author nsirbu
 * @since 10.02.2021
 */
public class Polymorphism {

  public static void main(String[] args) {
    // Accessing the object using its type.
    Circle someCircle1 = new Circle(5);
    someCircle1.calculateArea();

    // Accessing the object using its super type.
    TwoDimensionalShape someCircle2 = new Circle(5);
    someCircle2.calculateArea();

    // Accessing the object using its super type.
    Shape someCircle3 = new Circle(5);
    someCircle3.calculateArea();

    // Accessing the object using its type.
    Sphere someSphere1 = new Sphere(8);
    someSphere1.calculateArea();
    someSphere1.calculateVolume();

    // Accessing the object using its super type.
    ThreeDimensionalShape someSphere2 = new Sphere(8);
    someSphere2.calculateArea();
    someSphere2.calculateVolume();

    // Accessing the object using its super type.
    Shape someSphere3 = new Sphere(8);
    someSphere3.calculateArea();
    // Can't access, there is no such method on the Shape class.
//    someSphere3.calculateVolume();
  }
}
