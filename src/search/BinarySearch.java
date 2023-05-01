package search;

// * ---------------------------------------------------------------------- * //

public class BinarySearch {
  private static int iterationCounter = 0;

  // * --- get/set -------------------------------------------------------- * //

  public static void resetIterationCounter() {
    BinarySearch.iterationCounter = 0;
  }

  // ------------------------------------------------------------------------ //
  
  public static int getIterationCounter() {
    return iterationCounter;
  }

  // * --- methods -------------------------------------------------------- * //

  public static int search(int[] vector, int value) {
    int min = 0;
    int max = vector.length - 1;

    return binarySearch(vector, value, min, max);
  }

  private static int binarySearch(int[] vector, int value, int min, int max ) {
    iterationCounter++;

    if (max < min) {
      return -1;
    }
    
    int center = (min + max) / 2; 

    if (vector[center] == value) {
      return center; 
    }

    else if (vector[center] > value) {
      return binarySearch(vector, value, min, center -1);
    }

    else {
      return binarySearch(vector, value, center + 1, max);
    }
  }
}
