package edu.tekwill.java.nonaccessmodifiers;

/**
 * @author nsirbu
 * @since 05.02.2021
 */
public class Main {

  public static void main(String[] args) {

    // Accessing static members using the class name.
    System.out.println(WorkingWithStatic.age);
    WorkingWithStatic.doSomething();

    // Accessing static members using an object reference.
    WorkingWithStatic sm = new WorkingWithStatic();
    sm.age = 13;
    sm.doSomething();

    // Accessing a final variable.
    System.out.println(WorkingWithFinal.PI);

    // Not possible to change the value of a final variable.
//    WorkingWithFinal.PI= 4.14;
  }
}
