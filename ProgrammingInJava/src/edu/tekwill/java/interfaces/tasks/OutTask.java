package edu.tekwill.java.interfaces.tasks;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class OutTask extends AbstractTask {

  private String valueToPrint;

  public OutTask(String valueToPrint) {
    this.valueToPrint = valueToPrint;
  }

  @Override
  public String toString() {
    return "OutTask{" +
            "valueToPrint='" + valueToPrint + '\'' +
            '}';
  }
}
