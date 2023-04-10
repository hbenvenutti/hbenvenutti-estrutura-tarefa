import java.util.Scanner;

// * ---------------------------------------------------------------------- * //

public class SearchArray {
  private static Scanner scanner = new Scanner(System.in);
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

  public static void compareSearches(int[] vector) {
    int linearIterations;

    counter = 0;

    System.out.println("\nValor para ser encontrado: ");
    String input = scanner.nextLine();

    if (!Utils.isNumeric(input)) return;

    int value = Integer.parseInt(input);

    binarySearch(vector, 0, vector.length -1, value);
    
    int index = linearSearch(vector, value);

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

  // ------------------------------------------------------------------------ //

  public static int linearSearch(int[] vector, int value) {
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == value) {
        return i;
      }
    }

    return -1;
  }

  // ------------------------------------------------------------------------ //

  public static void findValueInArrayCommand(int[] vector) {
    System.out.println("\nValor para ser encontrado: ");
    String input = scanner.nextLine();

    if (!Utils.isNumeric(input)) return;
    
    Integer value = Integer.parseInt(input);

    int index = linearSearch(vector, value);
    
    if (index < 0) {
      System.out.println("\nValor não encontrado!\n");
      return;
    }

    System.out.printf("Encontrado o valor %s na posição %s\n", value, index);
    return;
  }
}
