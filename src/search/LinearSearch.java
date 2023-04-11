package search;

public class LinearSearch {
  private static int iterationsCounter = 0;

  // * --- get/set -------------------------------------------------------- * //

  public static int getIterationsCounter() {
    return iterationsCounter;
  }


  // * --- methods -------------------------------------------------------- * //

  public static int execute(int[] vector, int value) {
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] != value) continue;

      iterationsCounter = i + 1;

      return i;
    }

    iterationsCounter = vector.length;
    return -1;
  }
}
