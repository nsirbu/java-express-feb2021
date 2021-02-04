package edu.tekwill.java.flowcontrol;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 03.02.2021
 */
public class WorkingWithWhile {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first number: ");

    int sum = 0;
    int count = 0;
    int userNumber = sc.nextInt();

    while (userNumber != 0) {
      sum += userNumber;
      count++;

      System.out.print("Enter another number: ");
      userNumber = sc.nextInt();
    }

    System.out.println("Sum is: " + sum);
    System.out.println("Count is: " + count);
  }
}
