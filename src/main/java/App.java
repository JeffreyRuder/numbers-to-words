import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {}

  public static String numberToWord (Integer inputNumber) {
    String results = new String();
    ArrayList<String> inputAsStringArray = new ArrayList<String>();

    ArrayList<Integer> inputAsArray = new ArrayList<Integer>();
    do{
      inputAsArray.add(inputNumber % 10);
      inputNumber /= 10;
    } while (inputNumber > 0);

    Integer[] ones = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    String[] onesString = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    Integer[] twos = { 2, 3, 4, 5, 6, 7, 8, 9 };
    String[] twosString = { "twenty-", "thirty-", "forty-", "fifty-", "sixty-", "seventy-", "eighty-", "ninety-" };

    HashMap<Integer, String> hashMapOnes = new HashMap<Integer, String>();

    for( int i = 0; i < ones.length; i++ ) {
      hashMapOnes.put(ones[i], onesString[i]);
    }

    HashMap<Integer, String> hashMapTwos = new HashMap<Integer, String>();
    for( int i = 0; i < twos.length; i++ ) {
      hashMapTwos.put(twos[i], twosString[i]);
    }

    for( int i = 0; i < inputAsArray.size(); i++ ) {
      if ( i == 0 ) {
        inputAsStringArray.add(hashMapOnes.get(inputAsArray.get(i)));
      } else {
        inputAsStringArray.add(hashMapTwos.get(inputAsArray.get(i)));
      }
    }
    //change inputAsArray into a string array

    for( int i = inputAsStringArray.size() - 1; i >= 0; i-- ) {
      results = results + inputAsStringArray.get(i);
    }

    //String double = new String(hashMapOnes.concat(hashMapTwos));

    return results;
  }

}
