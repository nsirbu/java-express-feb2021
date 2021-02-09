package edu.tekwill.java.lists;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 09.02.2021
 */
public class ListReverser {
  ArrayList<String> reverse(ArrayList<String> inputList) {
    ArrayList<String> reversedList = new ArrayList<>();
    for (String element : inputList) {
      reversedList.add(new StringBuilder(element).reverse().toString());
    }

    return reversedList;
  }
}
