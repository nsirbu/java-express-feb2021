package edu.tekwill.java.overloading;

/**
 * @author nsirbu
 * @since 04.02.2021
 */
public class Parallelogram {

  int calculatePerimeter(int width, int height) {
    return 2 * width * height;
  }

  int calculatePerimeter(int sideLength) {
    return 4 * sideLength;
  }
}
