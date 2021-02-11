package edu.tekwill.java.interfaces.shapes;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class Main {
  public static void main(String[] args) {
    Circle someCircle = new Circle(new Point(5, 5), 3);
    System.out.println(someCircle);

    someCircle.moveUp(2);
    someCircle.moveLeft(3);

    System.out.println(someCircle);
  }
}
