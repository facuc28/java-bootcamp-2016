package Package;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by facundo crusta on 10/01/2017.
 */
public class Main {

    public static void main(String args[])
    {
        //Objects
        Country C1 = new Country("Argentina","AR","ARG");

        Atmosphere A1 = new Atmosphere(20,100.4,10,0);
        Wind W1 = new Wind(35,10);
        Actual Act1 = new Actual("11/05/17","Algo nublado",5);
        Extended E1 = new Extended("11/05/17","Algo nublado","Tue",20.0,10.0);
        Weather weather = new Weather("11/05/17","Algo nublado",Act1,E1,W1,A1);
        City city = new City("Almafuerte","AR","ARG", weather);
        City city1 = new City("Embalse","AR","ARG", weather);
        List<City> listOfCities = new ArrayList<City>();
        listOfCities.add(0,city);
        listOfCities.add(1,city1);
        State state0 = new State("Cordoba","AR","ARG","CB", 202587, "Cordoba", listOfCities);
        State state1 = new State("Buenos Aires","AR","ARG", "BS AS", 205252,"La Plata",listOfCities);

        C1.addState(0,state0);
        C1.addState(1,state1);



        //Print to screen

        System.out.println(C1.getState("CB").toString());
        System.out.println(C1.toString());
        System.out.println(city.toString());
    }
}
