package edu.tekwill.java.inheritance.person;

/**
 * @author nsirbu
 * @since 10.02.2021
 */
public class Main {

  public static void main(String[] args) {
    Student someStudent = new Student("Tom", "Chisinau", "IT", 2, 50.0);
    System.out.println(someStudent);

    Staff someStaff = new Staff("Tom", "Chisinau", "NR1", 50.0);
    System.out.println(someStaff);

    // Can't instantiate an abstract class.
//    Person somePerson = new Person("Mike", "NL");
//    System.out.println(somePerson);
  }
}
