package edu.tekwill.java.ifelse;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 02.02.2021
 */
public class IfElseStatement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    int firstNumber = sc.nextInt();
    System.out.print("Please enter the second number: ");
    int secondNumber = sc.nextInt();

    int max;
    // The curly braces on the if-else statement are mandatory only if there is more than one instruction to execute.
    if (firstNumber > secondNumber) {
      max = firstNumber;
      System.out.println("The first number is the bigger than the second one.");
    } else {
      max = secondNumber;
      System.out.println("The second number is the bigger than the first one.");
    }

    System.out.println("Max value is: " + max);
  }
}
