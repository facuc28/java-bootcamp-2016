package Package;

/**
 * Created by facun on 10/01/2017.
 */
public class Weather {

    private String date;
    private String description;
    private Actual ActualWeather;
    private Extended extendedWeather;

    public Weather(){}
    public Weather(String date, String description) {
        this.date = date;
        this.description = description;
    }

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

    public String toString() {
        return "Weather{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
