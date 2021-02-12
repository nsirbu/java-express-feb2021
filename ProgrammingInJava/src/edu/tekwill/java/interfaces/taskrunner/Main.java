package edu.tekwill.java.interfaces.taskrunner;

import edu.tekwill.java.interfaces.container.Container;
import edu.tekwill.java.interfaces.container.Stack;
import edu.tekwill.java.interfaces.tasks.CounterOutTask;
import edu.tekwill.java.interfaces.tasks.OutTask;
import edu.tekwill.java.interfaces.tasks.RandomOutTask;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class Main {

  public static void main(String[] args) {
    Container stack = new Stack();
    stack.push(new CounterOutTask());
    stack.push(new OutTask("Bye"));
    stack.push(new RandomOutTask());

    System.out.println(stack);
    System.out.println("=====");

    PrintTimeTaskRunner runner = new PrintTimeTaskRunner(stack);
    runner.addTask(new OutTask("Hi"));
    runner.executeAll();

    System.out.println("=====");
    System.out.println(stack);
  }
}
