package Package;

/**
 * Created by facundo crusta on 10/01/2017.
 */
public class Extended extends Weather {

    //Attributes
    private String weekDay;
    private double maximum;
    private double minimum;

    //Constructors
    public Extended(){}
    public Extended(String weekDay, double maximum, double minimum) {
        this.weekDay = weekDay;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public Extended(String date, String description, String weekDay, double maximum, double minimum) {
        super(date, description);
        this.weekDay = weekDay;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    //Getters and Setters methods
    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }
    public String getDate()
    {
        return  super.getDate();
    }
    public void setDate(String date)
    {
        super.setDate(date);
    }
    public String getDescription()
    {
        return super.getDescription();
    }
    public void setDescription(String description)
    {
        super.setDescription(description);
    }

    //ToString method
    public String toString() {
        return "{" +
                "Week Day='" + weekDay + '\'' +
                ", maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}
