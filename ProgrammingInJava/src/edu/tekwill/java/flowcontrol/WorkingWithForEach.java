package edu.tekwill.java.flowcontrol;

/**
 * @author nsirbu
 * @since 03.02.2021
 */
public class WorkingWithForEach {

  public static void main(String[] args) {
    String[] cars = {"Toyota", "BMW", "Mercedes"};

    // Iterating over the array using a regular for.
    for (int index = 0; index < cars.length; index++) {
      System.out.println(cars[index]);
    }

    // Iterating over the array using a for-each (enhanced for).
    for (String car : cars) {
      System.out.println(car);
    }
  }
}
