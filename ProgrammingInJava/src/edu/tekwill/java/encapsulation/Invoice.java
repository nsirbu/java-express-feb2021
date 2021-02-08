package edu.tekwill.java.encapsulation;

/**
 * @author nsirbu
 * @since 08.02.2021
 */
public class Invoice {

  private String partNumber;
  private String description;
  private int qty;
  private double price;

  public Invoice(String partNumber, String description, int qty, double price) {
    this.partNumber = partNumber;
    this.description = description;
    setQty(qty);
    setPrice(price);
  }

  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    if (qty > 0) {
      this.qty = qty;
    }
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price > 0) {
      this.price = price;
    }
  }

  public double getInvoiceAmount() {
    return price * qty;
  }
}
