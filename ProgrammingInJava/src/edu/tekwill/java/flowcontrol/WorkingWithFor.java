package edu.tekwill.java.flowcontrol;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 03.02.2021
 */
public class WorkingWithFor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a positive number greater than 0: ");
    int userInput = sc.nextInt();

    // Displaying the numbers bigger than 0 but smaller than user's input in ASC order.
    for (int index = 1; index <= userInput; index++) {
      System.out.print(index + " ");
    }

    System.out.println();

    // Displaying the numbers bigger than 0 but smaller than user's input in DESC order.
    for (int index = userInput; index > 0; index--) {
      System.out.print(index + " ");
    }
  }
}
