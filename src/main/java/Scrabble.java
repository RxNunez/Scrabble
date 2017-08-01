

import java.util.Map;
import java.util.HashMap;




public class Scrabble {



      public Integer calculateScore(String inputWord) {

          Integer score = 0;
          char[] letters = inputWord.toCharArray();

          Map<Character, Integer> lettersAndNumbers = new HashMap();
          lettersAndNumbers.put('a', 1);
          lettersAndNumbers.put('e', 1);
          lettersAndNumbers.put('i', 1);
          lettersAndNumbers.put('o', 1);
          lettersAndNumbers.put('u', 1);
          lettersAndNumbers.put('l', 1);
          lettersAndNumbers.put('n', 1);
          lettersAndNumbers.put('s', 1);
          lettersAndNumbers.put('t', 1);
          lettersAndNumbers.put('d', 2);
          lettersAndNumbers.put('g', 2);
          lettersAndNumbers.put('b', 3);
          lettersAndNumbers.put('c', 3);
          lettersAndNumbers.put('m', 3);
          lettersAndNumbers.put('p', 3);
          lettersAndNumbers.put('f', 4);
          lettersAndNumbers.put('h', 4);
          lettersAndNumbers.put('v', 4);
          lettersAndNumbers.put('m', 4);
          lettersAndNumbers.put('y', 4);
          lettersAndNumbers.put('k', 5);
          lettersAndNumbers.put('j', 8);
          lettersAndNumbers.put('x', 8);
          lettersAndNumbers.put('q', 10);
          lettersAndNumbers.put('z', 10);

          for (int i = 0; i < letters.length; i++) {

//              System.out.println(letters);
              score += lettersAndNumbers.get(letters[i]);
          }




//


          System.out.println(score);
          return score;
      }


}
