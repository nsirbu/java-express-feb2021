package edu.tekwill.java.constructors;

/**
 * @author nsirbu
 * @since 08.02.2021
 */
public class Student {

  //  private String name = "Unknown";
  private String name;

  Student() {
    name = "Unknown";
  }

  Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}


