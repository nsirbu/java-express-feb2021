package edu.tekwill.java.equation;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author nsirbu
 * @since 03.02.2021
 */
public class QuadraticEquation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the value for a: ");
    int a = sc.nextInt();
    System.out.print("Please enter the value for b: ");
    int b = sc.nextInt();
    System.out.print("Please enter the value for c: ");
    int c = sc.nextInt();

    int delta = b * b - 4 * a * c;
    double x1 = 0;
    double x2 = 0;

    if (delta > 0) {
      x1 = (-b + Math.sqrt(delta)) / (2 * a);
      x2 = (-b - Math.sqrt(delta)) / (2 * a);
      System.out.println("X1 = " + x1);
      System.out.println("X2 = " + x2);
    }

    if (delta == 0) {
      x1 = x2 = -b / (2 * a);
      System.out.println("X1 = X2 = " + x1);
    }

    if (delta < 0) {
      System.out.println("There are no roots for this equation.");
    }
  }
}
