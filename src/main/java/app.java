
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class app {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word and we can give you Scrabble points for it, don't cheat.");

        try{
            String stringInputWord = bufferedReader.readLine();

        Scrabble scrabble = new Scrabble();
        Integer score = scrabble.calculateScore(stringInputWord);
        System.out.println(score);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


