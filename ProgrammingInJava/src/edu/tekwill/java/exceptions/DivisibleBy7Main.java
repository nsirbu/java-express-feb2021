package edu.tekwill.java.exceptions;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class DivisibleBy7Main {

  public static void main(String[] args) {
    DivisibleBy7 divisible = new DivisibleBy7();
    try {
      int count = divisible.countDivisibleBy7(4, 99);
      System.out.println(count);
    } catch (InvalidRangeException e) {
      e.printStackTrace();
    }

    try {
      int count1 = divisible.countDivisibleBy7(99, 4);
      System.out.println(count1);
    } catch (InvalidRangeException e) {
      e.printStackTrace();
    }
  }
}
