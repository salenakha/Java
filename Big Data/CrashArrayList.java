package BigDataProject;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * ID, 0(Pos in Data) 1(Order) 0(Pos in Arr)
 * Severity, 1(Pos in Data) 2(Order) 1(Pos in Arr)
 * Start_Time, 2(Pos in Data) 3(Order) 2(Pos in Arr)
 * End_Time, 3(Pos in Data) 4(Order) 3(Pos in Arr)
 * Street, 11(Pos in Data) 5(Order) 4(Pos in Arr)
 * City, 13(Pos in Data) 6(Order) 5(Pos in Arr)
 * State, 15(Pos in Data) 7(Order) 6(Pos in Arr)
 * Zipcode, 16(Pos in Data) 8(Order) 7(Pos in Arr)
 * Country, 17(Pos in Data) 9(Order) 8(Pos in Arr)
 * Visibility(mi), 25(Pos in Data) 10(Order) 9(Pos in Arr)
 * Wind_Direction, 26(Pos in Data) 11(Order) 10(Pos in Arr)
 * Wind_Speed(mph), 27(Pos in Data) 12(Order) 11(Pos in Arr)
 * Precipitation(in), 28(Pos in Data) 13(Order) 12(Pos in Arr)
 * Weather_Condition, 29(Pos in Data) 14(Order) 13(Pos in Arr)
 */

public class CrashArrayList {
    private String fileName = "/Users/salenakha/IdeaProjects/Forloops/src/BigDataProject/US_Accidents_Dec21_updated.csv";
    private ArrayList<ArrayList<String>> file;

    /**
     * Constructor
     *
     * @throws IOException
     */
    public CrashArrayList() throws IOException {
        this.fileName = fileName;
        this.file = new ArrayList<ArrayList<String>>();
        // this.vars = new String[31];
        fillArray();
    }

    /**
     * fills arraylist with data
     *
     * @throws IOException
     */
    private void fillArray() throws IOException {
        File input = new File(fileName);
        Scanner words = new Scanner(input);
        int count = 0;

        while (words.hasNextLine()) {
            String line = words.nextLine();
            ArrayList<String> vars = new ArrayList<String>();

            for (int i = 0; i < 30; i++) {
                if (i <= 3 || (i >= 11 && i % 2 != 0 && i <= 15) || (i >= 16 && i < 18) || (i >= 25 && i < 30)) {
                    vars.add(line.substring(0, line.indexOf(",")));
                    line = line.substring(line.indexOf(",") + 1, line.length() - 1);
                } else {
                    line = line.substring(line.indexOf(",") + 1, line.length() - 1);
                }
            }
            file.add(vars);
            count++;
        }
        file.remove(0);
    }

    /**
     * getter for arraylist at a certain position inside another arraylist
     *
     * @param index
     * @return ArrayList<String>
     */
    public ArrayList<String> getArr(int index) {
        ArrayList<String> newLine = file.get(index);
        return newLine;
    }

    /**
     * getter for size of array;ost
     *
     * @return int
     */
    public int getSize() {
        return file.size();
    }

    /**
     * adds arraylist to data set arraylist
     *
     * @param str
     */
    public void addToArr(ArrayList<String> str) {
        file.add(str);
    }

    /**
     * removes arraylist from outer arraylist at certain index
     *
     * @param index
     */
    public void remove(int index) {
        file.remove(index);
    }
}