package modules;
import java.util.Arrays;
import java.util.Stack;

// * ---------------------------------------------------------------------- * //

public class DataPresentation {
  
  public static void countValues(int[] vector) {
    if (!Sort.verifyIfVectorIsSorted()) return;

    int emptyValuesCounter = 0;

    
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] != 0) break;
      
      emptyValuesCounter++;
    }

    int significantValues = vector.length - emptyValuesCounter;

    System.out
      .printf("\nQuantidade de valores significativos no vetor: %s", significantValues);

    return;
  }

  // ------------------------------------------------------------------------ //

  public static void listArray(int[] vector) {
    Stack<Integer> stack = new Stack<Integer>();

    System.out.println("Listagem do vetor:");

    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == 0) continue;

      stack.push(vector[i]);
    }

    System.out.println(Arrays.toString(stack.toArray()));
  }
}
