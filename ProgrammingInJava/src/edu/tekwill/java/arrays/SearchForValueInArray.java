package edu.tekwill.java.arrays;

/**
 * @author nsirbu
 * @since 03.02.2021
 */
public class SearchForValueInArray {

  public static void main(String[] args) {
    int[] someNumbers = {-3, 4, 6, 8, -9, 6, 3};

    int search = -3;
    boolean found = false;

    for (int element : someNumbers) {
      if (element == search) {
        found = true;
        break;
      }
    }

    System.out.println(found ? "Found it!" : "Could not find anything!");
  }
}
