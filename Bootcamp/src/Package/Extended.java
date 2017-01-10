package Package;

/**
 * Created by facun on 10/01/2017.
 */
public class Extended extends Weather {

    private String weekDay;
    private float maximum;
    private float minimum;

    public Extended(){}
    public Extended(String weekDay, float maximum, float minimum) {
        this.weekDay = weekDay;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public Extended(String date, String description, String weekDay, float maximum, float minimum) {
        super(date, description);
        this.weekDay = weekDay;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public float getMaximum() {
        return maximum;
    }

    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }

    public float getMinimum() {
        return minimum;
    }

    public void setMinimum(float minimum) {
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

}
