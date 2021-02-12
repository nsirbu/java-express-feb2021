package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.CounterOutTask;
import edu.tekwill.java.interfaces.tasks.OutTask;
import edu.tekwill.java.interfaces.tasks.RandomOutTask;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class Main {
  public static void main(String[] args) {
    Container queue = new Queue();
    queue.push(new OutTask("Hi"));
    queue.push(new RandomOutTask());

    Container stack = new Stack();
    stack.push(new CounterOutTask());
    stack.push(new OutTask("Bye"));
    stack.push(new RandomOutTask());

    System.out.println(queue);
    System.out.println(stack);

    stack.transferFrom(queue);

    System.out.println(queue);
    System.out.println(stack);
  }
}
