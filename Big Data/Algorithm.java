package BigDataProject;
import java.io.*;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collection;

public class Algorithm {
    // Crash crash = new Crash(0);
    CrashArrayList crashfile = new CrashArrayList();

    public Algorithm() throws IOException {

    }

    public double avSev() throws IOException {
        int i;
        int total = 0;
        for (i = 0; i < crashfile.getSize(); i++) {
            Crash crash = new Crash(crashfile, i);
            total += crash.getSev();
        }
        return total / i;
    }

    public double avCrashDur() throws IOException {
        int i;
        int total = 0;
        for (i = 0; i < crashfile.getSize(); i++) {
            Crash crash = new Crash(crashfile, i);
            total += crash.getDTime();
        }
        return total / i;
    }

    public int max(int[] arr){
        // find biggest state
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(max == arr[i]){
                index = i;
            }
        }

        return index;
    }

    public int worstTime() throws IOException {
        ArrayList<Integer> worstHour= new ArrayList<Integer>();

        for(int i = 0; i<crashfile.getSize()-1; i++){
            Crash crash = new Crash(crashfile, i);
            for(int j = 0; j<crash.getSev(); j++    ){
                worstHour.add(crash.getSHour());
            }
        }

        int[] hours = new int[24];
        for (int i = 0; i < hours.length-1; i++){
            int count = 0;
            for (int j = 0; j < worstHour.size(); j++) {
                if (worstHour.get(j).equals(hours[i]))
                    count++;
            }
            hours[i] = count;
        }


        return max(hours);
    }



    public String worstState() throws IOException {
        ArrayList<String> crashStatesSev = new ArrayList<String>();
        String[] stateName = {"AK","AL","AR","AZ","CA","CO","CT","DC","DE","FL","GA","HI","IA","ID","IL","IN","KS","KY","LA","MA","MD","ME","MI","MN","MS","MO","MT","NC","NE","NH","NJ","NM","NV","NY","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};

        // puts state and sev in arraylist
        for (int i = 0; i < crashfile.getSize() - 1; i++) {
            Crash crash = new Crash(crashfile, i);
            for (int j = 0; j < crash.getSev(); j++) {
                crashStatesSev.add(crash.getState());
            }
        }

        int[] stateCounterNums = new int[51];
        for (int i = 0; i < stateName.length-1; i++){
            int count = 0;
            for (int j = 0; j < crashStatesSev.size(); j++) {
                if (crashStatesSev.get(j).equals(stateName[i]))
                    count++;
            }
            stateCounterNums[i] = count;
        }

        return stateName[max(stateCounterNums)];
    }
}
