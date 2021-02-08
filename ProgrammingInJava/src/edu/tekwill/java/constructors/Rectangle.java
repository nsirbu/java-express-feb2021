package edu.tekwill.java.constructors;

/**
 * @author nsirbu
 * @since 08.02.2021
 */
public class Rectangle {

  private int width;
  private int length;

  Rectangle() {
    this(0, 0);

//    or like this, they both do the same
//    this(0);
  }

  Rectangle(int newWidth, int newLength) {
    width = newWidth;
    length = newLength;
  }

  Rectangle(int sideLength) {
    this(sideLength, sideLength);
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  int getArea() {
    return width * length;
  }
}
