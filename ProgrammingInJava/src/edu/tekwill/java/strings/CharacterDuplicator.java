package edu.tekwill.java.strings;

/**
 * Perform some manipulations on Strings.
 *
 * @author nsirbu
 * @since 09.02.2021
 */
public class CharacterDuplicator {

  /**
   * Duplicates each character in the given String.
   *
   * @param inputValue the String the characters of which have to be duplicated.
   * @return a new String where each character is duplicated.
   */
  String duplicateEachChar(String inputValue) {
    // input -> welcome
    // output -> wweellccoommee

    StringBuilder sb = new StringBuilder();
    for (int index = 0; index < inputValue.length(); index++) {
      char charToDuplicate = inputValue.charAt(index);
      sb.append(charToDuplicate).append(charToDuplicate);
    }

    return sb.toString();
  }
}
