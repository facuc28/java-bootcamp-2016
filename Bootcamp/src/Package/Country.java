package Package;

/**
 * Created by facun on 10/01/2017.
 */
public class Country {

    private String name;
    private String countryCode2;
    private String countryCode3;

    public Country ()
    {}
    public Country(String name, String countryCode2, String countryCode3)
    {
        this.name = name;
        this.countryCode2 = countryCode2;
        this.countryCode3 = countryCode3;
    }
    public String getName()
    {
        return this.name;
    }
    public String getCountryCode2()
    {
        return this.countryCode2;
    }
    public String getCountryCode3()
    {
        return countryCode3;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCountryCode2(String countryCode2)
    {
        this.countryCode2 = countryCode2;
    }
    public void setCountryCode3(String countryCode3)
    {
        this.countryCode3 = countryCode3;
    }

}