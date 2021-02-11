package edu.tekwill.java.exceptions;

/**
 * @author nsirbu
 * @since 11.02.2021
 */
public class DivisibleBy7 {

  int countDivisibleBy7(int start, int end) throws InvalidRangeException {
    if (start >= end) {
      InvalidRangeException exception = new InvalidRangeException("Invalid range: minimum is greater or equal to maximum.");
      throw exception;
    }

    int count = 0;
    for (int index = start; index <= end; index++) {
      if (index % 7 == 0) {
        count++;
      }
    }

    return count;
  }
}
