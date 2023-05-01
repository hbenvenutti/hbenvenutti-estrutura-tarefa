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

  public static void sort(int[] vector) {
    bubblesort(vector, vector.length - 1);
    return;
  }

  // ------------------------------------------------------------------------ //

  private static void bubblesort(int[] vector, int end){
    if (end == 0) return;

    for (int i = 0; i < end; i++) {
      comparisonCounter++;
      if (vector[i] < vector[i+1]) continue;

      int aux = vector[i];
      vector[i] = vector[i + 1];
      vector[i+1] = aux;

      swapCounter++;
    }

    bubblesort(vector, end - 1);
    return;
  }
}
