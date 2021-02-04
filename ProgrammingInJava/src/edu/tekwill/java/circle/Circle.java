package edu.tekwill.java.circle;

/**
 * @author nsirbu
 * @since 04.02.2021
 */
public class Circle {

  int radius;

  void calculateArea() {
    double area = Math.PI * radius * radius;

//    This instruction below produces the same result as the one from above.
//    double area = Math.PI * Math.pow(radius, 2);

    System.out.println("Circle area is: " + area);
  }
}
