package io;

import java.util.Scanner;

public class Input {
  private static final Scanner scanner = new Scanner(System.in);

  // ------------------------------------------------------------------------ //

  public static String string() {
    return scanner.nextLine();
  }

  // ------------------------------------------------------------------------ //

  public static int integer() {
    try {
      int value = scanner.nextInt();
      
      return Math.abs(value);

    } catch (Exception e) {
      Output.printError("O valor inserido não é válido!");
      return -1;
    }
  }
}
