package write;

import search.LinearSearch;

public class Delete {
  public static void byValue(int[] vector, int value) {
    int position = LinearSearch.execute(vector, value);

    vector[position] = 0;
  }

  public static void byIndex(int[] vector, int index) {
    vector[index] = 0;
  }
}
