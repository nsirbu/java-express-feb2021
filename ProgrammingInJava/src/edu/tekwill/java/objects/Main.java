package edu.tekwill.java.objects;

/**
 * @author nsirbu
 * @since 04.02.2021
 */
public class Main {

  public static void main(String[] args) {
    Student someStudent; // creating a NULL reference
    someStudent = new Student(); // initializing the object
    someStudent.name = "Tom";
    someStudent.roll_no = 1;

    String objectState = someStudent.printState();
    System.out.println(objectState);
  }
}
