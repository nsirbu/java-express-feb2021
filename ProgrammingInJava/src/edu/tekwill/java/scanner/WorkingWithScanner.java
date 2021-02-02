package edu.tekwill.java.scanner;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 02.02.2021
 */
public class WorkingWithScanner {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int userInput = sc.nextInt();

    System.out.println("User has entered the following value: " + userInput);
  }
}
