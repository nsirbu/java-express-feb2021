package edu.tekwill.java.accessmodifiers.building;

import edu.tekwill.java.accessmodifiers.library.Book;

/**
 * @author nsirbu
 * @since 05.02.2021
 */
public class House {

  void read() {
    Book book = new Book();

    // Accessing public class members.
    book.isbn = "def";
    book.printBook();

    // Not possible to access protected class members from a different package using an object reference.
//    book.author = "";
//    book.modifyTemplate();

    // Not possible to access protected class members from a different package using the 'this' keyword if there is no
    // inheritance relationship between these two classes.
//    this.author = "";
//    this.modifyTemplate();

    // Not possible to access package-private (default) class members from a different package.
//    book.issueCount = 0;
//    book.issueCount();

    // Not possible to access private members outside the class defining them.
    // They can be used only inside the class Book.
//    book.pages = 0;
//    book.countPages();
  }
}
