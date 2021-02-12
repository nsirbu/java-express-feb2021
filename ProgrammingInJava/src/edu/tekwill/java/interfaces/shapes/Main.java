package edu.tekwill.java.interfaces.shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class Main {
  public static void main(String[] args) {
    Circle someCircle = new Circle(new Point(5, 5), 3);
//    System.out.println(someCircle);
//    someCircle.moveUp(2);
//    someCircle.moveLeft(3);
//    System.out.println(someCircle);

    Rectangle someRectangleTwo = new Rectangle(new Point(3, 3), 5, 2);
//    System.out.println(someRectangleTwo);
//    someRectangleTwo.moveDown(4);
//    System.out.println(someRectangleTwo);
//
    Rectangle someRectangleOne = new Rectangle(new Point(2, 3), 5, 2);
//    System.out.println(someRectangleOne);
//    someRectangleOne.moveDown(4);
//    System.out.println(someRectangleOne);

    Triangle someTriangle = new Triangle(new Point(3, 3), new Point(0, 0), new Point(6, 0));
//    System.out.println(someTriangle);
//    someTriangle.moveRight(4);
//    System.out.println(someTriangle);

    List<IMovable> shapes = new ArrayList<>();
    shapes.add(someCircle);
    shapes.add(someRectangleOne);
    shapes.add(someRectangleTwo);
    shapes.add(someTriangle);

    System.out.println(shapes);
    for (IMovable shape : shapes) {
      shape.moveRight(5);
    }
    System.out.println();
    System.out.println(shapes);
  }
}
