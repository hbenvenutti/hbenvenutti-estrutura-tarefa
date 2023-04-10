import java.util.Random;
import java.util.Scanner;

public class CommandsV2 {
  private static Scanner scanner = new Scanner(System.in);
  private static Random random = new Random();
  private static int counter; 

  // * -------------------------------------------------------------------- * //
  
  public static void binarySearchCommand(int[] vector) {
    System.out.println("\nValor para ser encontrado: ");
    String input = scanner.nextLine();

    if (!Utils.isNumeric(input)) return;

    int value = Integer.parseInt(input);

    int min = 0;
    int max = vector.length -1;

    int index = binarySearch(vector, min, max, value);
    
    if (index < 0) {
      System.err.println("O elemento não foi encontrado!");
      return;
    }

    System.out.printf("O valor %d foi encontrado na posição %d", value, index);
    
    return;
  }
  
  // ------------------------------------------------------------------------ //

  private static int binarySearch(int[] vector, int min, int max, int value) {
    counter++;
    
    if (max < min) {
      return -1;
    }
    
    int center = (min + max) / 2; 

    if (vector[center] == value) {
      return center; 
    }

    else if (vector[center] > value) {
      return binarySearch(vector, min, center -1, value);
    }

    else {
      return binarySearch(vector, center + 1, max, value);
    }
  }

  // ------------------------------------------------------------------------ //

  public static void SeedVectorWithRandom(int[] vector) {
    int acc = 0;

    for (int i = 0; i < vector.length; i++) {
      int integer = Math.abs(random.nextInt(1000));
      vector[i] = acc + integer;
      acc = vector[i];
    }
  }

  // ------------------------------------------------------------------------ //

  public static void compareSearch(int[] vector) {
    int linearIterations;

    counter = 0;

    System.out.println("\nValor para ser encontrado: ");
    String input = scanner.nextLine();

    if (!Utils.isNumeric(input)) return;

    int value = Integer.parseInt(input);

    binarySearch(vector, 0, vector.length -1, value);
    
    int index = Commands.linearSearch(vector, value);

    if (index < 0) {
      linearIterations = vector.length;
    }
    else {
      linearIterations = index + 1;
    }

    System.out.println("Numero de iterações:");
    System.out.printf("\nBinária: %d;", counter);
    System.out.printf("\nLinear: %d;", linearIterations);
  }
}
