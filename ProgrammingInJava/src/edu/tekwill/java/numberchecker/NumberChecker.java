package edu.tekwill.java.numberchecker;

/**
 * @author nsirbu
 * @since 04.02.2021
 */
public class NumberChecker {

  boolean isPositive(int numberToCheck) {
//    1. This is one option of doing it.
//    if (numberToCheck > 0) {
//      return true;
//    } else {
//      return false;
//    }

//    2. That's another way of doing it.
//    boolean isPositive = numberToCheck > 0 ? true : false;
//    return isPositive;

//    3. Or even simpler like this.
    return numberToCheck > 0;
  }
}
