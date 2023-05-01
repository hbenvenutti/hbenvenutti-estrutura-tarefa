package read;

public class Find {
  public static int greatest(int[] vector) {
    int last = vector.length - 1;
    return vector[last];
  }

  // ------------------------------------------------------------------------ //

  public static int lowest(int[] vector) {
    int lowest = 0;
  
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == 0) continue;
  
      lowest = vector[i];
      break;
    }
  
    return lowest;
  }

  // ------------------------------------------------------------------------ //
}
