public class Utils {
  static public boolean isNumeric(String value) {
    try {
      Integer.parseInt(value);
      
      return true;

    } catch (Exception e) {
      System.err.println("O valor inserido não é válido!");

      return false;
    }
  }
}
