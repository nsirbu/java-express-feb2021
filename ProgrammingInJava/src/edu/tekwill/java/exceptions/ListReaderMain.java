package edu.tekwill.java.exceptions;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class ListReaderMain {

  public static void main(String[] args) {
    ListReader lr = new ListReader();
    int sum = lr.parse("1, 2, 3, r,45, t, k, 9");
    System.out.println(sum);
  }
}
