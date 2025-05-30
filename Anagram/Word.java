package AnagramLab;
import java.util.Arrays;

/**
 * @author salenakha
 * @version 11-11-22
 */
public class Word {

    public String word;
    public String alpha;

    public Word(String word) {
        this.word = word;
        this.alpha = convertAlpha(word);
    }

    public String getWord(){
        return word;
    }

    public String getAlpha(){
        return alpha;
    }
    public static String convertAlpha(String word)
    {
        char wordCharArray[] = word.toCharArray(); //word to char array

        Arrays.sort(wordCharArray); //sort char array

        String alpha = String.valueOf(wordCharArray);
        return alpha; //return char array
    }

    public boolean isAnagram(String anagramTest) {
        return this.alpha.equals(convertAlpha(anagramTest));
    }

}
