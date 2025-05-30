package BigDataProject;
import java.io.*;
import java.util.ArrayList;

class Crash {

    ArrayList<String> line;

    public Crash(CrashArrayList crashfile, int index) throws IOException {
        line = crashfile.getArr(index);
        this.line = line;

        // getters
        // System.out.println("Severity " + getSev());
        // System.out.println("Start Time " + getSTime());
        // System.out.println("End Time " + getETime());
        // System.out.println("Street " + getStreet());
        // System.out.println("City " + getCity());
        // System.out.println("State " + getState());
        // System.out.println("Zipcode " + getZip());
        // System.out.println("Country " + getCountry());
        // System.out.println("Visiblility(mi) " + getVis());
        // System.out.println("Wind Direction " + getWindDir());
        // System.out.println("Wind Speed(MPH) " + getWindSpeed());
        // System.out.println("Precipitation(in) " + getPrecip());
        // System.out.println("Weather Condition " + getWeatherCon());
        // System.out.println();
        // combined getters
        // System.out.println("Delta Time " + getDTime());
        // System.out.println(getYear());
        // System.out.println(getSMin());
        // System.out.println(getEMin());
        // System.out.println(getSHour());
        // System.out.println(getEHour());

        // System.out.println("Full Location " + getLoc());
        // System.out.println("Full Weather " + getWeather());
    }

    /**
     * gets severity
     *
     * @return int
     */
    public int getSev() {
        return Integer.parseInt(line.get(1));
    }

    /**
     * gets start time
     *
     * @return String
     */
    public String getSTime() {
        return line.get(2);
    }

    /**
     * gets end time
     *
     * @return String
     */
    public String getETime() {
        return line.get(3);
    }

    /**
     * gets street name
     *
     * @return String
     */
    public String getStreet() {
        return line.get(4);
    }

    /**
     * gets city name
     *
     * @return String
     */
    public String getCity() {
        return line.get(5);
    }

    /**
     * gets state name
     *
     * @return String
     */
    public String getState() {
        return line.get(6);
    }

    /**
     * gets zipcode
     *
     * @return int
     */
    public int getZip() {
        return Integer.parseInt(line.get(7));
    }

    /**
     * gets country name
     *
     * @return String
     */
    public String getCountry() {
        return line.get(8);
    }

    /**
     * gets visibility
     *
     * @return double
     */
    public double getVis() {
        return Double.parseDouble(line.get(9));
    }

    /**
     * gets wind direction
     *
     * @return String
     */
    public String getWindDir() {
        return line.get(10);
    }

    /**
     * gets wind speed
     *
     * @return double
     */
    public double getWindSpeed() {
        return Double.parseDouble(line.get(11));
    }

    /**
     * gets precipitation
     *
     * @return double
     */
    public double getPrecip() {
        return Double.parseDouble(line.get(12));
    }

    /**
     * gets weather condition
     *
     * @return String
     */
    public String getWeatherCon() {
        return line.get(13);
    }

    /**
     * gets delta time
     *
     * @return int
     */
    public int getDTime() {
        return (getEMin() + getEHour() * 60) - (getSMin() + getSHour() * 60);
    }

    /**
     * gets year
     *
     * @return int
     */
    public int getYear() {
        return Integer.parseInt(getETime().substring(0, 4));
    }

    /**
     * get start minute
     *
     * @return int
     */
    public int getSMin() {
        return Integer.parseInt(getSTime().substring(14, 16));
    }

    /**
     * get end minute
     *
     * @return int
     */
    public int getEMin() {
        return Integer.parseInt(getETime().substring(14, 16));
    }

    /**
     * get start hour
     *
     * @return int
     */
    public int getSHour() {
        return Integer.parseInt(getSTime().substring(11, 13));
    }

    /**
     * get end hour
     *
     * @return int
     */
    public int getEHour() {
        return Integer.parseInt(getETime().substring(11, 13));
    }

    /**
     * gets full location
     *
     * @return String
     */
    public String getLoc() {
        return getStreet() + ", " + getCity() + ", " + getState() + ", " + getZip() + ", " + getCountry();
    }

    /**
     * gets full weather
     *
     * @return String
     */
    public String getWeather() {
        return getVis() + ", " + getWindDir() + ", " + getWindSpeed() + ", " + getPrecip() + ", " + getWeatherCon();
    }

}