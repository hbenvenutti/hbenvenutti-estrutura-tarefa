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

  public static int execute(int[] vector, int min, int max, int value) {
    iterationCounter++;
    
    if (max < min) {
      return -1;
    }
    
    int center = (min + max) / 2; 

    if (vector[center] == value) {
      return center; 
    }

    else if (vector[center] > value) {
      return execute(vector, min, center -1, value);
    }

    else {
      return execute(vector, center + 1, max, value);
    }
  }
}
