package edu.tekwill.java.strings;

/**
 * @author nsirbu
 * @since 09.02.2021
 */
public class CharacterCheckerMain {
  public static void main(String[] args) {
    CharacterChecker characterChecker = new CharacterChecker();
    System.out.println("moon#night -> " + characterChecker.checkString("moon#night"));
    System.out.println("moon#white -> " + characterChecker.checkString("moon#white"));
    System.out.println("#carblue -> " + characterChecker.checkString("#carblue"));
    System.out.println("month# -> " + characterChecker.checkString("month# "));
  }
}
