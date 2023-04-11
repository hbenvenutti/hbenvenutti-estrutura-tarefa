package sort;

// * ---------------------------------------------------------------------- * //

public class QuickSort {
  private static int swapCounter = 0;
  private static int comparisonCounter = 0;

  // * -------------------------------------------------------------------- * //

  public static void resetComparisonCounter() {
    QuickSort.comparisonCounter = 0;
  }

  // ------------------------------------------------------------------------ //

  public static void resetSwapCounter() {
    QuickSort.swapCounter = 0;
  }

  // ------------------------------------------------------------------------ //

  public static int getComparisonCounter() {
    return comparisonCounter;
  }

  // ------------------------------------------------------------------------ //

  public static int getSwapCounter() {
    return swapCounter;
  }

  // ------------------------------------------------------------------------ //

  public static void sort(int[] vector, int start, int end) {

    int pivotPosition = start;
    int pivot = vector[pivotPosition];
    int left = start;
    int right = end;

    while(left<=right) {
      while (vector[left] < pivot) {
        left++;
        comparisonCounter++;
      }
      while (vector[right] > pivot) {
        right--;
        comparisonCounter++;
      }

      if (left<=right) {
        int aux = vector[left];
        vector[left] = vector[right];
        vector[right]= aux;

        swapCounter++;

        left++;
        right--;
      }
    }

    if (start < right) sort(vector, start, right);
    
    if (left < end) sort(vector, left, end);
  }
}
