import java.util.Random;
// import java.util.Scanner;

public class SeedVector {
  // private static Scanner scanner = new Scanner(System.in);
  private static Random random = new Random();

  // * -------------------------------------------------------------------- * //

  public static void SeedWithRandom(int[] vector) {
    int acc = 0;

    for (int i = 0; i < vector.length; i++) {
      int integer = Math.abs(random.nextInt(1000));
      vector[i] = acc + integer;
      acc = vector[i];
    }

    System.err.println("Vetor populado com sucesso!");
  }
}
