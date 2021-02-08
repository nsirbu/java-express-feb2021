package edu.tekwill.java.constructors;

/**
 * @author nsirbu
 * @since 08.02.2021
 */
public class Main {
  public static void main(String[] args) {
//    Student someStudent = new Student();
//    System.out.println(someStudent.getName());
//
//    Student someOtherStudent = new Student("Tom");
//    System.out.println(someOtherStudent.getName());

    Rectangle rectangleOne = new Rectangle();
    System.out.println(rectangleOne.getArea());

    Rectangle rectangleTwo = new Rectangle(3, 5);
    System.out.println(rectangleTwo.getArea());

    Rectangle rectangleThree = new Rectangle(3);
    System.out.println(rectangleThree.getArea());
  }
}
