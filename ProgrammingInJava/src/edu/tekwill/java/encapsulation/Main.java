package edu.tekwill.java.encapsulation;

/**
 * @author nsirbu
 * @since 08.02.2021
 */
public class Main {
  public static void main(String[] args) {
    Invoice someInvoice = new Invoice("abc", "some description", 93, 4.3);
    System.out.println(someInvoice.getInvoiceAmount());
  }
}
