import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleTest {


    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }
    @Test
    public void calculateScore_returnsScoreForMultipleLetters_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("aa"));
    }
    @Test
    public void calculateScore_returnsScoreForStringsOfLetters_3() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 14;
        assertEquals(expected, testScrabble.calculateScore("queen"));
    }


}
