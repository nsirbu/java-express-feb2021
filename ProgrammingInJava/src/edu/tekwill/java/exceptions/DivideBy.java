package edu.tekwill.java.exceptions;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class DivideBy {
  private int number;

  public DivideBy(int number) {
    this.number = number;
  }

  double divideBy(int divideBy) {
    if (divideBy == 0) {
      throw new IllegalArgumentException("It is not possible to divide by 0!");
    }
    return number / divideBy;
  }
}
