package edu.tekwill.java.numberchecker;

/**
 * @author nsirbu
 * @since 04.02.2021
 */
public class Main {

  public static void main(String[] args) {
    NumberChecker nc = new NumberChecker();
    boolean result = nc.isPositive(5);
    System.out.println("Is it positive? " + result);
  }
}
