package edu.tekwill.java.lists;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author nsirbu
 * @since 09.02.2021
 */
public class PluralRemoval {

  ArrayList<String> removePlurals(ArrayList<String> listToProcess) {
    ListIterator<String> it = listToProcess.listIterator();

    while (it.hasNext()) {
      String elementFromList = it.next();
      if (elementFromList.endsWith("s") || elementFromList.endsWith("S")) {
        it.remove();
      }
    }

    return listToProcess;
  }
}
