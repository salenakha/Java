import java.util.Scanner;

public class HangmanTester {
    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Enter word to be guessed: ");
        String word = inputWord.next();

        for (int i = 0; i <15; i++){
            System.out.println("\n");
        }

        Hangman h = new Hangman(word);
        h.playGame();
    }
}
