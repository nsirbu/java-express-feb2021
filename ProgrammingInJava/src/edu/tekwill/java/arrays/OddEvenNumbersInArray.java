package edu.tekwill.java.arrays;

/**
 * @author nsirbu
 * @since 03.02.2021
 */
public class OddEvenNumbersInArray {

  public static void main(String[] args) {
    int[] someNumbers = {-3, 4, 6, 8, -9, 6, 3};
    int oddCount = 0;

    for (int element : someNumbers) {
      if (element % 2 == 1 || element % 2 == -1) {
        oddCount++;
      }
    }

    int evenNumbers = someNumbers.length - oddCount;
    System.out.println("Odd numbers: " + oddCount);
    System.out.println("Even numbers: " + evenNumbers);
  }
}
