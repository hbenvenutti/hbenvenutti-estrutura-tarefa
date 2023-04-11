package sort;

// * ---------------------------------------------------------------------- * //

public class QuickSort {

  public static void sort(int[] vector, int start, int end) {
    int pivotPosition = start;
    int pivot = vector[pivotPosition];
    int left = start;
    int right = end;

    while(left<=right) {
      while (vector[left] < pivot) left++;
      while (vector[right] > pivot) right--;

      if (left<=right) {
        int aux = vector[left];
        vector[left] = vector[right];
        vector[right]= aux;

        left++;
        right--;
      }
    }

    if (start < right) sort(vector, start, right);
    
    if (left < end) sort(vector, left, end);
  }
}
