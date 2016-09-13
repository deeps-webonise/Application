/**
 * Created by webonise on 13/9/16.
 */

public class Ferrari implements ICar{

    int yearOfMaunfacture;
    String engine;
    int noOfTyres;

    Ferrari(){
       yearOfMaunfacture=2005;
       engine="abc";
       noOfTyres=4;
   }


    @Override
    public void hasAirbags() {
        System.out.println("Car has AirBags");

    }

    @Override
    public void hasRoof() {
        System.out.println("Car has Roof");

    }

    @Override
    public void hasWheels() {
        System.out.println("Car has "+ noOfTyres + "wheels");

    }

    @Override
    public void hasEngine() {
        System.out.println("Car has an engine");


    }
}
