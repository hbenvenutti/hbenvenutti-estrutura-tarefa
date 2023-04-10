import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// * ---------------------------------------------------------------------- * //

public class Commands {
  private static Scanner scanner = new Scanner(System.in);
  
  // *** --- READ functions --------------------------------------------- *** //
  
  static public void biggestValue(int [] vector) {
    int position = vector.length - 1;
    int biggest = vector[position];

    System.out.println("\nO maior valor no vetor é:");

    System.out.printf("\n%s, na posição %s\n", biggest, position);
    return;
  }

  // ------------------------------------------------------------------------ //

  public static void countValues(int[] vector) {
    int counter = 0;
    System.out.println("\nQuantidade de valores significativos no vetor:");

    for (int i = 0; i < vector.length; i++) {
      if (vector[i] != 0) {
        counter++;
      }
    }

    System.out.printf("\n%s\n", counter);
    return;
  }

  // ------------------------------------------------------------------------ //

  public static void findValueInArrayCommand(int[] vector) {
    System.out.println("\nValor para ser encontrado: ");
    String input = scanner.nextLine();

    if (!Utils.isNumeric(input)) return;
    
    Integer value = Integer.parseInt(input);

    int index = linearSearch(vector, value);
    
    if (index < 0) {
      System.out.println("\nValor não encontrado!\n");
      return;
    }

    System.out.printf("Encontrado o valor %s na posição %s\n", value, index);
    return;
  }

  // ------------------------------------------------------------------------ //
  public static int linearSearch(int[] vector, int value) {
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == value) {
        return i;
      }
    }

    return -1;
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
  
  // *** --- write functions -------------------------------------------- *** //
  
  public static void addValueToArray(int[] vector) {
    System.out.println("\nValor para ser inserido (deve ser inteiro e positivo): ");
    
    String value = scanner.nextLine();
    
    if (!Utils.isNumeric(value)) return;

    Integer number = Integer.parseInt(value);
    
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == 0) {
        vector[i] = Math.abs(number);
        break;
      }

      if (i == vector.length -1) {
        System.out.println("\nVetor cheio!\n");
        return;
      }
    }

    Arrays.sort(vector);
  }

  // ------------------------------------------------------------------------ //

  public static void removeValueFromArray(int[] vector) {
    System.out.println("\nValor a ser removido: ");
    Integer value = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == value) {
        vector[i] = 0;
        return;
      }
    }

    System.out.println("\nValor não encontrado!\n");
    return;
  }
}
