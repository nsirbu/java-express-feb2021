package edu.tekwill.java.lists;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 09.02.2021
 */
public class ListReverserMain {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("apples");
    list.add("car");
    list.add("people");

    ListReverser lr = new ListReverser();
    System.out.println(list);
    ArrayList<String> resultList = lr.reverse(list);
    System.out.println(resultList);
  }
}
