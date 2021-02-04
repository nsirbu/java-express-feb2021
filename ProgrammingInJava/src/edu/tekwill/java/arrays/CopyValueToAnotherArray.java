package edu.tekwill.java.arrays;

import java.util.Arrays;

/**
 * @author nsirbu
 * @since 03.02.2021
 */
public class CopyValueToAnotherArray {

  public static void main(String[] args) {
    int[] sourceArray = {-3, 4, 6, 8, -9, 6, 3};
    int[] targetArray = new int[sourceArray.length];

    System.out.println("Source array: " + Arrays.toString(sourceArray));
    System.out.println("Target array before copy: " + Arrays.toString(targetArray));

    for (int index = 0; index < sourceArray.length; index++) {
      int sourceElement = sourceArray[index];
      targetArray[index] = sourceElement;
    }

    System.out.println("Target array after copy: " + Arrays.toString(targetArray));
  }
}
