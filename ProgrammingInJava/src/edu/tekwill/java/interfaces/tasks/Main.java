package edu.tekwill.java.interfaces.tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class Main {

  public static void main(String[] args) {
    List<AbstractTask> tasks = new ArrayList<>();
    tasks.add(new OutTask("This is the first task to run!"));
    tasks.add(new RandomOutTask());
    tasks.add(new CounterOutTask());
    tasks.add(new CounterOutTask());
    tasks.add(new CounterOutTask());
    tasks.add(new RandomOutTask());

    for (AbstractTask task : tasks) {
      task.execute();
    }
  }
}
