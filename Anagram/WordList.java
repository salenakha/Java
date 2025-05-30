package AnagramLab;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordList {

    private Word[] wordList;
    private int arrIndex;

    // /Users/salenakha/IdeaProjects/Forloops/src/small-words.txt
    // /Users/salenakha/IdeaProjects/Forloops/src/dictionary (1).txt

    public WordList(String fileName, int maxLength) {
        wordList = new Word[200000];
        arrIndex = 0;

        File input = new File(fileName);
        Scanner words = null;
        try {
            words = new Scanner(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (words.hasNextLine()) {
            String line = words.nextLine();

            if (line.length() <= maxLength) {
                Word w = new Word(line);
                wordList[arrIndex] = w;
                arrIndex++;
            }
        }
        words.close();
    }

    public String getAnagrams(String inputWord) {
        String result = "";
        for(Word w: this.wordList) {
            if(w == null) break;
            if (w.getAlpha().equals(w.convertAlpha(inputWord)) && !w.getWord().equals(inputWord)) {
                result = result + w.getWord() + "\n";
            }
        }
        return result;
    }

}
