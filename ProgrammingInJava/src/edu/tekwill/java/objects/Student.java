package edu.tekwill.java.objects;

/**
 * @author nsirbu
 * @since 04.02.2021
 */
public class Student {

  String name;
  int roll_no;

  String printState() {
    String state = "Student[name=" + name + ", roll_no=" + roll_no + "]";
    return state;
  }
}
