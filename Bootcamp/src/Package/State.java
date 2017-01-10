package Package;

/**
 * Created by facundo crusta on 10/01/2017.
 */
public class State {
    //Attributes
    private String countryCode;
    private String name;
    private String abbr;
    private long area;
    private String capital;
    private Weather weather;
    //Constructor
    public State ()
    {

    }
    //Constructor with parameters
    public State(String countryCode, String name, String abbr, long area, String capital, Weather weather)
    {
        this.countryCode = countryCode;
        this.name = name;
        this.abbr = abbr;
        this.area = area;
        this.capital = capital;
        this.weather =  weather;
    }
    //Getter methods
    public String getCountryCode() {
        return countryCode;
    }

    public String getName() {
        return name;
    }

    public String getAbbr() {
        return abbr;
    }

    public long getArea() {
        return area;
    }

    public String getCapital() {
        return capital;
    }
    // Setter Methods
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }


   public void setCapital(String capital) {
        this.capital = capital;
    }

    public String toString() {
        return "State info {" +
                "Country Code='" + countryCode + '\'' +
                ", Name='" + name + '\'' +
                ", Abbreviation='" + abbr + '\'' +
                ", Area=" + area +
                ", Capital='" + capital + '\'' +
                '}' + "\n" +
                "Weather information for State on date "+weather.toString();
    }
}
