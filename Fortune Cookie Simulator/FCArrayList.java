package FortuneCookieLab;

public class FCArrayList {
    FortuneCookie fc;

    public FCArrayList() { //default constructor
        this.fc = new FortuneCookie();
    }

    public int size(){ //gets the size of list
        return fc.getFortuneCookie().size();
    }

    public int peek() { //returns the first number in the list
        return fc.getFortuneCookie().get(0);
    }

    public int poll() { //removes the head of the list
        return fc.getFortuneCookie().remove(0);
    }

    public int getFortune(int ind) { //return the cookie at some index
        return fc.getFortuneCookie().get(ind);
    }

    public int remove(int ind) { //removes a cookie at some index
        return fc.getFortuneCookie().remove(ind);
    }

    public void add(int elm, int ind){ //replaces a specific index with a new element
        fc.getFortuneCookie().set(ind, elm);
    }

    public String toString() { //toString
        return fc.toString();
    }
}
