package modules;
import java.util.Scanner;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.QuickSort;
import sort.SelectionSort;

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
        BubbleSort.execute(vector, end);
        break;
      }

      case "3": {
        SelectionSort.execute(vector);
        break;
      }

      case "4": {
        InsertionSort.execute(vector);
        break;
      }

      default: {
        return;
      }
    }

    setVectorSorted(true);
  }

  // ------------------------------------------------------------------------ //

  public static void compareSortMethods(int[] vector) {
    int start = 0;
    int end = vector.length-1;
    int swapCounter;
    int comparisonCounter;
    long startTime;
    long endTime;
    long executionTime;

    int[] copy1 = vector.clone();
    int[] copy2 = vector.clone();
    int[] copy3 = vector.clone();
    int[] copy4 = vector.clone();

    // *** --- quick ---------------------------------------------------- *** //
    QuickSort.resetComparisonCounter();
    QuickSort.resetSwapCounter();

    startTime = System.currentTimeMillis();
    QuickSort.sort(copy1, start, end);
    endTime = System.currentTimeMillis();

    executionTime = endTime - startTime;

    swapCounter = QuickSort.getSwapCounter();
    comparisonCounter = QuickSort.getComparisonCounter();
    
    System.out.println("QuickSort");
    System.out.println("Comparações: " + comparisonCounter);
    System.out.println("Trocas: " + swapCounter);
    System.out.println("Tempo de execução: " + executionTime + "ms");

    // *** --- bubble --------------------------------------------------- *** //
    BubbleSort.resetComparisonCounter();
    BubbleSort.resetSwapCounter();

    startTime = System.currentTimeMillis();
    BubbleSort.execute(copy2, end);
    endTime = System.currentTimeMillis();

    executionTime = endTime - startTime;

    swapCounter = BubbleSort.getSwapCounter();
    comparisonCounter = BubbleSort.getComparisonCounter();

    System.out.println("\nBubbleSort");
    System.out.println("Comparações: " + comparisonCounter);
    System.out.println("Trocas: " + swapCounter);
    System.out.println("Tempo de execução: " + executionTime + "ms");

    // *** --- selection ------------------------------------------------ *** //
    SelectionSort.resetComparisonCounter();
    SelectionSort.resetSwapCounter();

    startTime = System.currentTimeMillis();
    SelectionSort.execute(copy3);
    endTime = System.currentTimeMillis();

    executionTime = endTime - startTime;

    swapCounter = SelectionSort.getSwapCounter();
    comparisonCounter = SelectionSort.getComparisonCounter();

    System.out.println("\nSelectionSort");
    System.out.println("Comparações: " + comparisonCounter);
    System.out.println("Trocas: " + swapCounter);
    System.out.println("Tempo de execução: " + executionTime + "ms");

    // *** --- insertion ------------------------------------------------ *** //
    InsertionSort.resetComparisonCounter();
    InsertionSort.resetSwapCounter();

    startTime = System.currentTimeMillis();
    InsertionSort.execute(copy4);
    endTime = System.currentTimeMillis();

    executionTime = endTime - startTime;

    swapCounter = InsertionSort.getSwapCounter();
    comparisonCounter = InsertionSort.getComparisonCounter();

    System.out.println("\nInsertionSort");
    System.out.println("Comparações: " + comparisonCounter);
    System.out.println("Trocas: " + swapCounter);
    System.out.println("Tempo de execução: " + executionTime + "ms");
  }
}
