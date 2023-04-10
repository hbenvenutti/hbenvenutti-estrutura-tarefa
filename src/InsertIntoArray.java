import java.util.Scanner;

// * ---------------------------------------------------------------------- * //

public class InsertIntoArray {
  private static Scanner scanner = new Scanner(System.in);

  // *** --- private methods -------------------------------------------- *** //

  private static void handleVectorFull() {
    System.out.println("Vetor cheio!");
    return;
  }

  // *** --- public methods --------------------------------------------- *** //

  public static void addValueToArray(int[] vector) {
    System.out
      .println("\nValor para ser inserido (deve ser inteiro e positivo): ");
    
    String value = scanner.nextLine();
    
    if (!Utils.isNumeric(value)) return;

    Integer number = Integer.parseInt(value);
    
    for (int i = 0; i < vector.length; i++) {
      
      if (vector[i] != 0) continue;

      vector[i] = Math.abs(number);

      System.out.println("Valor inserido com sucesso!");

      return;
    }

      handleVectorFull();
  }
}
