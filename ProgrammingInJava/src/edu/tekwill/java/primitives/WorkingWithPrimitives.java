package edu.tekwill.java.primitives;

/**
 * @author nsirbu
 * @since 02.02.2021
 */
public class WorkingWithPrimitives {

  public static void main(String[] args) {
    byte byteValue = 10;

    // 1000 is exceeds the range of byte data type. The code won't compile.
    // byte byteValue = 1000;

    short shortValue = 314;

    // 999 is exceeds the range of short data type. The code won't compile.
    // short shortValue = 999;

    int intValue = 9999;

    // 12345678901 is exceeds the range of int data type. The code won't compile.
    // int intValue1 = 12345678901;

    long longValue = 10000000000L;

    // 10000000000000000000 is exceeds the range of long data type. The code won't compile.
    // long longValue = 10000000000000000000L;
  }
}
