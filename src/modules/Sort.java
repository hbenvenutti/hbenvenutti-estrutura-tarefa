package modules;
import java.util.Scanner;

import sort.QuickSort;

// * ---------------------------------------------------------------------- * //

public class Sort {
  private static boolean isVectorSorted;
  private static Scanner scanner = new Scanner(System.in);

  // * --- get/set -------------------------------------------------------- * //

  public static void setVectorSorted(boolean isVectorSorted) {
      Sort.isVectorSorted = isVectorSorted;
  }

  // * --- methods -------------------------------------------------------- * //

  public static boolean verifyIfVectorIsSorted() {
    if (!isVectorSorted) System.err.println("Vector is not sorted!");
    return Sort.isVectorSorted;
  }

  // ------------------------------------------------------------------------ //

  public static void execute(int[] vector) {
    int start = 0;
    int end = vector.length-1;

    System.out.println("Escolha o método de sort:"
      + "\n1: Quick Sort;"
      + "\n2: Bubble Sort;"
      + "\n3: Selection Sort;"
      + "\n4: Insertion Sort;"
    );

    String sortType = scanner.nextLine();

    switch(sortType) {
      case "1": {
        QuickSort.sort(vector, start, end);
        break;
      } 
      case "2": {
        break;
      }

      default: {
        return;
      }
    }

    setVectorSorted(true);
  }
}
