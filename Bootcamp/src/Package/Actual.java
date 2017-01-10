package Package;

/**
 * Created by facun on 10/01/2017.
 */
public class Actual extends Weather {

    private float temprature;
    private Weather C1;
    public Actual (){}

    public Actual(String date, String description, float temprature) {
        super(date, description);
        this.temprature = temprature;
    }

    public float getTemprature() {
        return temprature;
    }
    public String getDate(){
        return super.getDate();
    }
    public String getDescription()
    {
        return super.getDescription();
    }

    public void setTemprature(float temprature) {
        this.temprature = temprature;
    }
    public void setDate(String date)
    {
        super.setDate(date);
    }
    public void setDescription(String description)
    {
        super.setDescription(description);
    }

}
