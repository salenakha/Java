public class LipogramAnalyzer {

    public static void main(String[] args) {

    }

    private String text;
    //this is the text that save the text string and go through the processor

    public LipogramAnalyzer(String text) {
        this.text = text;
    }

    public String mark(char letter) {
        //returns the saved text string with all chars equal to letter to '#'
        return text.replace(letter, '#');
    }

    public String removePunctuation(String text) {
        //removes all punctuation by checking if each letter is a letter
        String result = "";
        for(char a: text.toCharArray()) { //for each loop going through char
            if(Character.isLetter(a)) { //if the character is the letter, add it to the word
                result += a;
            }
        }
        return result; //returns word without punctuation
    }

    public String allWordsWith(char letter) {
        String offendingWords = "";
        int i = 0;
        while (i < text.length()) { //goes through the text to look for the letter
            char thisChar = text.charAt(i);
            if (thisChar == letter) { //when it finds the letter
                int first = text.lastIndexOf(' ', i); //checks where the first space is to find beginning of word
                    if (first == -1) { //edge case where first word contains letter
                    first = 0;
                    }
                int second = text.indexOf(' ', i); //checks where the second space is, end of word
                    if (second == -1) { //edge case where last word contains letter
                    second = text.length() - 1;
                    }
                String word = text.substring(first, second+1); //first space and last space
                word = removePunctuation(word); //apply the remove punctuation
                offendingWords += word + "\n";
                i = second + 1; //go to the next word once it finds the letter, so it doesn't repeat the same word
            } else {
                i++;
            }
        }
        return offendingWords; //returns the list of offending words
    }
}
