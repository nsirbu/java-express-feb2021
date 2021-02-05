package edu.tekwill.java.accessmodifiers.library;

/**
 * @author nsirbu
 * @since 05.02.2021
 */
public class CourseBook extends Book {

  void read() {
    Book book = new Book();

    // Accessing public class members.
    book.isbn = "def";
    book.printBook();

    // Accessing protected class members.
    book.author = "";
    book.modifyTemplate();

    // Accessing package-private (default) class members.
    book.issueCount = 0;
    book.issueCount();

    // Not possible to access private members outside the class defining them.
    // They can be used only inside the class Book.
//    book.pages = 0;
//    book.countPages();
  }
}
