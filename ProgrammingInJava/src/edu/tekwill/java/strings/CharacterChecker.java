package edu.tekwill.java.strings;

/**
 * @author nsirbu
 * @since 09.02.2021
 */
public class CharacterChecker {

  boolean checkString(String valueToCheck) {
    // moon#night
    int hashPosition = valueToCheck.indexOf("#");
    if (hashPosition == 0 || hashPosition == valueToCheck.length()) {
      return false;
    }

    if (hashPosition != -1) {
      int charBeforeHash = valueToCheck.charAt(hashPosition - 1);
      int charAfterHash = valueToCheck.charAt(hashPosition + 1);

      return charBeforeHash == charAfterHash;
    }

    return false;
  }
}
