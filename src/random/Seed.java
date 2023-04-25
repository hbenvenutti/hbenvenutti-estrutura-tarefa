package random;

import java.util.Random;

import io.Output;

public class Seed {
  private static Random random = new Random();
  
  // ------------------------------------------------------------------------ //

  public static void seed(int[] vector) {
    int limit = vector.length * 100;

    for (int i = 0; i < vector.length; i++) {
      int integer = Math.abs(random.nextInt(limit));
      vector[i] = integer;
    }

    Output.print("Vetor populado com sucesso!");
    return;
  }
}
