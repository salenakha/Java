import java.lang.StringBuffer;
import java.io.*;
import java.util.*;
import javax.swing.JFrame;

public class Hangman {
    private String secretWord;
    private JFrame frame;

    /*
     * Constructor takes in the word to be guessed
     */
    public Hangman(String secretWord) {
        this.secretWord = secretWord;
    }

    /*
     * Displays the hangman, takes body parts left as input
     * and shows the corresponding figure in the JFrame
     */
    public void displayFrame(int bodyParts) {
        frame = new JFrame();
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        switch (bodyParts) {
            case 5:
                frame.add(new StickFigure());
                break;
            case 4:
                frame.add(new StickFigure1());
                break;
            case 3:
                frame.add(new StickFigure2());
                break;
            case 2:
                frame.add(new StickFigure3());
                break;
            case 1:
                frame.add(new StickFigure4());
                break;
            case 0:
                frame.add(new StickFigure5());
                break;
        }
        frame.setVisible(true);
    }

    /*
     * Creates a dashed line to display how many letters in the word
     * to be guessed
     */
    public StringBuffer makeDashes(String secretWord) {
        StringBuffer a = new StringBuffer(secretWord.length());
        for (int i = 0; i < secretWord.length(); i++)
            a.append("-");
        return a;
    }

    /*
     * If the letter guessed by the user is correct, this method inserts that letter
     * into the result
     */
    public void setLetter(String secretWord, StringBuffer dashes, char letter) {
        for (int z = 0; z < secretWord.length(); z++) {
            if (secretWord.charAt(z) == letter) {
                dashes.setCharAt(z, letter);
            }
        }
        System.out.print("Correct! guess again \n");
    }

    /*
     * Play game method
     */
    public void playGame() {
        String startOver;
        do {
            Scanner inputGuess = new Scanner(System.in);
            StringBuffer dashes = makeDashes(secretWord);
            String guess = "";
            ArrayList<Character> guesses = new ArrayList<Character>();
            char letter = ' ';
            int MAXBODYPARTS = 5;
            boolean done = false;
            Boolean gameOver = false;

            while (!done) { //While playing
                System.out.println("Welcome to Hangman! Your Word is: " + dashes);
                System.out.println("Enter a guess");
                guess = inputGuess.next();

                if (guess.length() > 1) {
                    if (guess == secretWord)
                        System.out.println("You Win!");
                    else
                        System.out.println("You lose");
                    done = true;
                } else {
                    letter = guess.charAt(0);
                    if (guesses.contains(letter) && (secretWord.indexOf(letter) < 0)) {
                        System.out.println("Cannot use same letter! Game over.");
                        done = true;
                    } else
                        guesses.add(letter);

                    System.out.println("\nYou have  " + guesses + "  these letters you guessed so far\n");

                    if (secretWord.indexOf(letter) < 0) {
                        MAXBODYPARTS--;
                        System.out.println("Wrong guess, try again");
                        System.out.println(MAXBODYPARTS + " Body parts are left");
                    } else {
                        setLetter(secretWord, dashes, letter);
                        System.out.println(MAXBODYPARTS + " Body parts are left");
                    }

                    if (MAXBODYPARTS == 0) {
                        System.out.println("You lose!");
                        done = true;
                    }

                    if (secretWord.equals(dashes.toString())) { //If the word equals the players completed dash String, they win.
                        System.out.println("You Win!");
                        done = true;
                    }
                }
                displayFrame(MAXBODYPARTS);
            }

            System.out.println("Play again (enter y or n)");
            startOver = inputGuess.next();

            if (startOver.charAt(0) == 'n') {
                System.out.println("Thanks for playing, goodbye!");
                break;
            }

        } while (startOver.charAt(0) == 'y');
    }
}
