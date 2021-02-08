package edu.tekwill.java.strings;

/**
 * @author nsirbu
 * @since 08.02.2021
 */
public class WorkingWithString {

  public static void main(String[] args) {
    String input = "Let's go home, it's late already!";

    // Determining the character at a specific index.
    System.out.println(input.charAt(6));

    // Determining whether a string contains some other string.
    System.out.println(input.contains("home"));

    // Determining whether a string ends with a given string.
    System.out.println(input.endsWith("y!"));
    System.out.println(input.endsWith("?"));

    // Determining whether the string is equal to another string.
    System.out.println(input.equals("abc"));
    System.out.println(input.equals("Let's go home, it's late already!"));

    // Determining whether the string is equal to another string in a case insensitive manner.
    System.out.println(input.equalsIgnoreCase("let's go home, it's late already!"));
  }
}
