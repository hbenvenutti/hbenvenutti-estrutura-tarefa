package sort;

public class InsertionSort {
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
  public static void execute(int[] vector){

    for(int i = 1; i < vector.length; i++) {
      int value = vector[i];
      int j = i-1;

      /*
       * i = 1
       * j = 0
       * value = v[1]
       */
      while (j >= 0 ) {
        comparisonCounter++;
        if (value > vector[j]) break;

        vector[j+1] = vector[j];
        swapCounter++;
        j--;
      }

      vector[j+1] = value;
      swapCounter++;
    }
  }
}
