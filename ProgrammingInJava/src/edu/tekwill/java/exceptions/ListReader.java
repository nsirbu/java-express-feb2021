package edu.tekwill.java.exceptions;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class ListReader {

  int parse(String input) {
    ArrayList<Integer> parsedNumbers = getNumbers(input);
    return sum(parsedNumbers);
  }

  private ArrayList<Integer> getNumbers(String input) {
    // 1, 2, 3, r, 45, t, k, 9
    ArrayList<Integer> numbers = new ArrayList<>();
    String[] parts = input.split(",");

    for (String part : parts) {
      try {
        int converted = Integer.parseInt(part.trim());
        numbers.add(converted);
      } catch (NumberFormatException ex) {
        System.out.println(String.format("Could not parse input value [%s] to an Integer!", part));
      }
    }

    return numbers;
  }

  private int sum(ArrayList<Integer> numbers) {
    int sum = 0;
    for (Integer number : numbers) {
      sum += number;
    }

    return sum;
  }
}
