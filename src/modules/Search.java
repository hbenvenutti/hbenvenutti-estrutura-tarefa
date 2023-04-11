package modules;
import java.util.Scanner;

import search.BinarySearch;
import search.LinearSearch;
import validation.InputValidation;

// * ---------------------------------------------------------------------- * //

public class Search {
  // * --- variables ------------------------------------------------------ * //

  private static Scanner scanner = new Scanner(System.in);
  
  // * -------------------------------------------------------------------- * //

  public static void binarySearchCommand(int[] vector) {
    // *** --- validations ---------------------------------------------- *** //
    
    if (!Sort.verifyIfVectorIsSorted()) return;

    // *** --- input ---------------------------------------------------- *** //
    
    System.out.println("\nValor para ser encontrado: ");
    String input = scanner.nextLine();

    if (!InputValidation.isNumeric(input)) return;

    int value = Integer.parseInt(input);

    // *** --- input ---------------------------------------------------- *** //
    int min = 0;
    int max = vector.length -1;

    int index = BinarySearch.execute(vector, min, max, value);
    
    if (index < 0) {
      System.err.println("O elemento não foi encontrado!");
      return;
    }

    System.out.printf("O valor %d foi encontrado na posição %d", value, index);
    
    return;
  }

  // ------------------------------------------------------------------------ //

  public static void compareSearches(int[] vector) {
    // *** --- validation ----------------------------------------------- *** //
    
    if (!Sort.verifyIfVectorIsSorted()) return;

    // *** --- counters ------------------------------------------------- *** //

    BinarySearch.resetIterationCounter();

    // *** --- input ---------------------------------------------------- *** //
    System.out.println("\nValor para ser encontrado: ");
    String input = scanner.nextLine();

    if (!InputValidation.isNumeric(input)) return;

    int value = Integer.parseInt(input);

    // *** --- binary --------------------------------------------------- *** //

    BinarySearch.execute(vector, 0, vector.length -1, value);
    
    // *** --- linear --------------------------------------------------- *** //
    LinearSearch.execute(vector, value);
    
    
    // *** --- data presentation ---------------------------------------- *** //
    System.out.println("Numero de iterações:");
    System.out.printf("\nBinária: %d;", BinarySearch.getIterationCounter());
    System.out.printf("\nLinear: %d;", LinearSearch.getIterationsCounter());
  }

  // ------------------------------------------------------------------------ //

  public static void linearSearchCommand(int[] vector) {
    if (!Sort.verifyIfVectorIsSorted()) return;

    System.out.println("\nValor para ser encontrado: ");
    String input = scanner.nextLine();

    if (!InputValidation.isNumeric(input)) return;
    
    Integer value = Integer.parseInt(input);

    int index = LinearSearch.execute(vector, value);
    
    if (index < 0) {
      System.out.println("\nValor não encontrado!\n");
      return;
    }

    System.out.printf("Encontrado o valor %s na posição %s\n", value, index);
    return;
  }

  // ------------------------------------------------------------------------ //

  public static void findLowest(int[] vector) {
    if (!Sort.verifyIfVectorIsSorted()) return;
    
    int lowest = Integer.MAX_VALUE;
    int position = 0;

    System.out.println("\nO menor valor no vetor é:");

    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == 0) continue;

      lowest = vector[i];
      position = i;
      
      break;
    }

    System.out.printf("\n%s, na posição %s\n", lowest, position);
    return;
  }
  
  // ------------------------------------------------------------------------ //

  static public void findBiggest(int [] vector) {
    if (!Sort.verifyIfVectorIsSorted()) return;

    int position = vector.length - 1;
    int biggest = vector[position];

    System.out.println("\nO maior valor no vetor é:");

    System.out.printf("\n%s, na posição %s\n", biggest, position);
    return;
  }
}
