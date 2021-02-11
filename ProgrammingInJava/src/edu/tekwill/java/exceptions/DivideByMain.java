package edu.tekwill.java.exceptions;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class DivideByMain {

  public static void main(String[] args) {
    int divideBy = 0;

    DivideBy db = new DivideBy(5);
    try {
      double result = db.divideBy(divideBy);
      System.out.println(result);
    } catch (IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
