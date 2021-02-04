package edu.tekwill.java.flowcontrol;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 03.02.2021
 */
public class WorkingWithSwitch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number between 1 and 12: ");
    int userInput = sc.nextInt();

    switch (userInput) {
      case 1:
        System.out.println("Jan");
        break;
      case 2:
        System.out.println("Feb");
        break;
      case 3:
        System.out.println("Mar");
        break;
      case 4:
        System.out.println("Apr");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("Jun");
        break;
      case 7:
        System.out.println("Jul");
        break;
      case 8:
        System.out.println("Aug");
        break;
      case 9:
        System.out.println("Sep");
        break;
      case 10:
        System.out.println("Oct");
        break;
      case 11:
        System.out.println("Nov");
        break;
      case 12:
        System.out.println("Dec");
        break;
      default:
        System.out.println("Unknown month!");
    }
  }
}
