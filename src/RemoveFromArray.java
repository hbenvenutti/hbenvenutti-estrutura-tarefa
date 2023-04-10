import java.util.Scanner;

// * ---------------------------------------------------------------------- * //

public class RemoveFromArray {
  private static Scanner scanner = new Scanner(System.in);

  public static void removeValue(int[] vector) {
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