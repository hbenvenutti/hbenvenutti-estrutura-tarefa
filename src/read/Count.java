package read;

import io.Output;

public class Count {
  public static void valid(int[] vector) {
    int emptyValuesCounter = 0;
    
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] != 0) break;
      
      emptyValuesCounter++;
    }

    int significantValues = vector.length - emptyValuesCounter;

    String message = "\nQuantidade de valores significativos no vetor: " + significantValues;

    Output.print(message);
  }
}
