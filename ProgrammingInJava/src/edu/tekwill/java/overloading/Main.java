package edu.tekwill.java.overloading;

/**
 * @author nsirbu
 * @since 04.02.2021
 */
public class Main {

  public static void main(String[] args) {
    Parallelogram parallelogram = new Parallelogram();
    // calling an overloaded method
    parallelogram.calculatePerimeter(34);
    parallelogram.calculatePerimeter(2, 4);
  }
}
