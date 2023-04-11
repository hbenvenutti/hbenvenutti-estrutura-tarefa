package modules;
import java.util.Random;
// * ---------------------------------------------------------------------- * //

public class Seed {
  private static Random random = new Random();

  // * -------------------------------------------------------------------- * //

  public static void SeedRandomOrdered(int[] vector) {
    int acc = 0;

    for (int i = 0; i < vector.length; i++) {
      int integer = Math.abs(random.nextInt(1000));
      vector[i] = acc + integer;
      acc = vector[i];
    }

    System.err.println("Vetor populado com sucesso!");

    return;
  }

  // * -------------------------------------------------------------------- * //

  public static void seedRandom(int[] vector) {
    
    for (int i = 0; i < vector.length; i++) {
      int integer = Math.abs(random.nextInt(1000));
      vector[i] = integer;
    }

    System.err.println("Vetor populado com sucesso!");
    Sort.setVectorSorted(false);
    return;
  }
}
