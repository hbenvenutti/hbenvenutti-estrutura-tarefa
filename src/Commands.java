import java.util.Arrays;
import java.util.Stack;

// * ---------------------------------------------------------------------- * //

public class Commands {
  
  // *** --- READ functions --------------------------------------------- *** //
  
  static public void biggestValue(int [] vector) {
    int [] vectorCopy = vector.clone();

    Arrays.sort(vectorCopy);

    int position = vectorCopy.length - 1;
    int biggest = vectorCopy[position];

    System.out.println("\nO maior valor no vetor é:");

    System.out.printf("\n%s, na posição %s\n", biggest, position);
    return;
  }

  // ------------------------------------------------------------------------ //

  public static void countValues(int[] vector) {
    int emptyValuesCounter = 0;
    int [] vectorCopy = vector.clone();

    Arrays.sort(vectorCopy);
    
    for (int i = 0; i < vector.length; i++) {
      if (vectorCopy[i] != 0) break;
      
      emptyValuesCounter++;
    }

    int significantValues = vectorCopy.length - emptyValuesCounter;

    System.out
      .printf("\nQuantidade de valores significativos no vetor: %s", significantValues);

    return;
  }

  // ------------------------------------------------------------------------ //

  public static void lowestValue(int[] vector) {
    int lowest = Integer.MAX_VALUE;
    int position = 0;

    System.out.println("\nO menor valor no vetor é:");

    for (int i = 0; i < vector.length; i++) {
      if (vector[i] > lowest || vector[i] == 0) continue;

      lowest = vector[i];
      position = i;
    }

    System.out.printf("\n%s, na posição %s\n", lowest, position);
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
