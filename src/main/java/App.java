import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {}

  public static String numberToWord (Integer inputNumber) {

    Integer[] ones = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    String[] onesString = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

    for( int i = 0; i < ones.length; i++ ) {
      hashMap.put(ones[i], onesString[i]);
    }

    return hashMap.get(inputNumber);
  }

}
