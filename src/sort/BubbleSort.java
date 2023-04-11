package sort;

public class BubbleSort {
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

  // * -------------------------------------------------------------------- * //

  public static void execute(int[] vector, int end){
    if (end == 0) return;

    for (int i = 0; i < end; i++) {
      comparisonCounter++;
      if (vector[i] < vector[i+1]) continue;

      int aux = vector[i];
      vector[i] = vector[i + 1];
      vector[i+1] = aux;

      swapCounter++;
    }

    execute(vector, end - 1);
  }
}
