package Package;

/**
 * Created by facun on 10/01/2017.
 */
public class Atmosphere {

    private int humidity;
    private float pressure;
    private int visibility;
    private int rising;

    public Atmosphere(){}
    public Atmosphere(int humidity, float pressure, int visibility, int rising) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.visibility = visibility;
        this.rising = rising;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getRising() {
        return rising;
    }

    public void setRising(int rising) {
        this.rising = rising;
    }
}
