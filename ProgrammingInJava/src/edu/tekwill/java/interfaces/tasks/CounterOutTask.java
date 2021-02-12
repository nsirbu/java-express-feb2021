package edu.tekwill.java.interfaces.tasks;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class CounterOutTask extends AbstractTask {

  private static int counter;

  @Override
  public void execute() {
    counter++;
    super.execute();
  }

  @Override
  public String toString() {
    return "CounterOutTask{Executed " + counter + " times}";
  }
}
