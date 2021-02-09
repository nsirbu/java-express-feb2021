package edu.tekwill.java.equals;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 09.02.2021
 */
public class EmployeeMain {

  public static void main(String[] args) {
    ArrayList<Employee> employeeListOne = new ArrayList<>();
    ArrayList<Employee> employeeListTwo = new ArrayList<>();

    Employee emp1 = new Employee();
    // Can be replaced with a parameterized constructor.
    emp1.setId("1");
    emp1.setName("Tom");
    emp1.setSalary(1000);

    Employee emp2 = new Employee();
    emp2.setId("2");
    emp2.setName("Julia");
    emp2.setSalary(3000);

    Employee emp3 = new Employee();
    emp3.setId("3");
    emp3.setName("Mike");
    emp3.setSalary(3000);

    employeeListOne.add(emp1);
    employeeListOne.add(emp2);
    employeeListOne.add(emp3);

    Employee emp4 = new Employee("1", "Tom", 1000);
    Employee emp5 = new Employee("2", "Julia", 3000);
    Employee emp6 = new Employee("3", "Mike", 3000);

    employeeListTwo.add(emp4);
    employeeListTwo.add(emp5);
    employeeListTwo.add(emp6);

//    System.out.println(employeeListOne.equals(employeeListTwo));


    // Find an object inside a list.
    for (Employee emp : employeeListOne) {
      if (emp.getId().equals("2")) {
        System.out.println(emp);
        break;
      }
    }
  }
}
