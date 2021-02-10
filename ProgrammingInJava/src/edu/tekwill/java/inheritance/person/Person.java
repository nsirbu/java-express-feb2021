package edu.tekwill.java.inheritance.person;

/**
 * @author nsirbu
 * @since 10.02.2021
 */
public abstract class Person {
  private String name;
  private String address;

  protected Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return String.format("Person[name=%s, address=%s]", name, address);
  }
}
