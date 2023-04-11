package sort;

public class SelectionSort {
  private static int swapCounter = 0;
  private static int comparisonCounter = 0;

  // * -------------------------------------------------------------------- * //

  public static void resetComparisonCounter() {
    comparisonCounter = 0;
  }

  // ------------------------------------------------------------------------ //

  public static void resetSwapCounter() {
    swapCounter = 0;
  }

  // ------------------------------------------------------------------------ //

  public static int getComparisonCounter() {
    return comparisonCounter;
  }

  // ------------------------------------------------------------------------ //

  public static int getSwapCounter() {
    return swapCounter;
  }

  public static void execute(int[] vector) {
    for(int i = 0; i < vector.length - 1; i++) {
      for(int j = i+1; j < vector.length; j++) {
        comparisonCounter++;
        if (vector[i] < vector[j]) continue;

        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
        swapCounter++;
      }
    }
  } 
}
