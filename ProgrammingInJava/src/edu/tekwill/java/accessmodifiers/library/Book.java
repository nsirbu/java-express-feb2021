package edu.tekwill.java.accessmodifiers.library;

/**
 * @author nsirbu
 * @since 05.02.2021
 */
public class Book {

  public String isbn;
  protected String author;
  int issueCount;
  private int pages;

  public void printBook() {
    // Private attributes can be accessed only inside the class defining them.
    System.out.println(pages);
  }

  protected void modifyTemplate() {

  }

  void issueCount() {
    // Private methods can be invoked only inside the class defining them.
    countPages();
  }

  private void countPages() {
  }
}
