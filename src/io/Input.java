package io;

import java.util.Scanner;

public class Input {
  private static final Scanner scanner = new Scanner(System.in);

  // ------------------------------------------------------------------------ //

  public static String string(String message) {
    Output.print(message);
    return scanner.nextLine();
  }

  // ------------------------------------------------------------------------ //

  public static int integer(String message) {
    Output.print(message);
    String input = scanner.nextLine();

    try {
      int value = Integer.parseInt(input);
      return Math.abs(value);

    } catch (Exception e) {
      Output.printError("O valor inserido não é válido!");
      return -1;
    }
  }
}
