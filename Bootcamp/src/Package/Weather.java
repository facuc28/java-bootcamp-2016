package Package;

/**
 * Created by facundo crusta on 10/01/2017.
 */
public class Weather {

    //Attributes
    private String date;
    private String description;
    private Actual ActualWeather;
    private Extended extendedWeather;
    private Wind wind;
    //Constructors
    public Weather(){}
    public Weather(String date, String description){
        this.date = date;
        this.description = description;
    }
    public Weather(String date, String description, Actual actualWeather, Extended extendedWeather, Wind wind) {
        this.date = date;
        this.description = description;
        ActualWeather = actualWeather;
        this.extendedWeather = extendedWeather;
        this.wind = wind;
    }

    //Getters and Setters methods
    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //ToString method
    public String toString() {
        return date + "\n" +
                "  Wind=" + wind.toString() + "\n" +
                "  Description= '" + description  +"'"+'\n' +
                "Actual Weather= " + ActualWeather.toString() + "\n" +
                "Extended Weather=" + extendedWeather.toString() +
                '}';
    }
}
