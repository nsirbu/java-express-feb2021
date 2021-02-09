package edu.tekwill.java.lists;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 09.02.2021
 */
public class PluralRemovalMain {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("apples");
    list.add("car");
    list.add("people");

    PluralRemoval pr = new PluralRemoval();
    System.out.println(list);
    ArrayList<String> listWithoutPlurals = pr.removePlurals(list);
    System.out.println(listWithoutPlurals);
  }
}
