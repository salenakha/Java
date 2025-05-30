package AnagramLab;
import java.util.Objects;
import java.util.Scanner;

public class AnagramTester {
    public static void main(String[] args) {
        //ask user for length of words and file name to generate wordList
        //then ask user for the word, and match the alpha of this word to alpha of the words in wordList

        //corner case when the word is blank

        boolean wantsContinue = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Anagram! ");
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();

        while (wantsContinue) {
            System.out.println("Enter the max length of words: ");
            String userInputMaxLength = sc.nextLine();
            int maxlength = Integer.parseInt(userInputMaxLength); //max length of words


            System.out.println("Enter your word to find the Anagrams: ");
            String inputWord = sc.nextLine(); //word
            if(inputWord.isBlank() != true){
                inputWord = inputWord.toUpperCase();
            }else{
                System.out.println("Please enter a valid word"); //if word is " " then return this
                break;
            }

            WordList wordListObj = new WordList(fileName, maxlength); //create object to make the list
            String anagramResult = wordListObj.getAnagrams(inputWord); //convertAlpha of each word,
            System.out.println(anagramResult); //print this result of anagrams

            System.out.println("Would you like to keep playing? (Y/N)");
            String userContinues = sc.nextLine();
            if (!Objects.equals(userContinues, "Y")) { //if user types "N" then break out of loop and sc.close()
                break;
            }
        }

        System.out.println("Thank you for playing. ");
        sc.close();
    }
}
