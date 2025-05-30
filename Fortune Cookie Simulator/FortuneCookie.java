package FortuneCookieLab;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * @author: salenakha
 * @version: 12-1-22
 */
public class FortuneCookie {
    ArrayList <Integer> cookies = new ArrayList <Integer>(); //creating the cookies arraylist
    //create arraylist of 6 cookies

    private final int size = 6; //set the size to 6

    public FortuneCookie() { //default constructor
        Random r = new Random(); //randomize the 6 cookies in the fortune
        for (int i = 0; i < this.size; i++) {
            //how to create random
            cookies.add(i, r.nextInt(100));
        }
    }

    public ArrayList<Integer> getFortuneCookie() { //returns the cookies arraylist
        return this.cookies;
    }

    public boolean equalCookie(FortuneCookie c) { //returns if cookie is equal to another cookie
        return (this.cookies == c.cookies); //boolean if one arraylist is equal to another
    }

    public static int compareTo(List<Integer> one, List<Integer> two) { //compares one arraylist to another
        boolean equalFlag = false;
        for(int i = 0; i < 6; i++){
            if(one.get(i) < two.get(i)) return -1;
            else if(one.get(i) == two.get(i)) continue;
            else return 1;
        }
        return 0;
    }

    public static String getNumbers(ArrayList <Integer> a){ //get the numbers in String format
        String cookieString = "";

        for (int i = 0; i < a.size(); i++) {
            cookieString += a.get(i).toString(); //fix a[i]
        }
        return cookieString;
    }

    public String toString(){ //converts the arraylist to string
        return this.cookies.toString();
    }

}