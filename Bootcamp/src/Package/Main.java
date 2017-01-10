package Package;

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
        Weather weather = new Weather("11/05/17","Algo nublado",Act1,E1,W1);
        State state = new State("ARG","Cordoba","CB", 202587, "Cordoba", weather);

        //Print to screen
        System.out.println(state.toString()+ A1.toString());

    }
}
