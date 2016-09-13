/**
 * Created by webonise on 13/9/16.
 */
public class pulsar implements IMotorcycle {

    int yearOfMaunfacture;
    String engine;
    int noOfTyres;

    pulsar() {
        int yearOfMaunfacture=2007;
        String engine="def";
        int noOfTyres=2;
    }

    @Override
    public void hasPedal() {
        System.out.println("hasPedal");

    }

    @Override
    public void hasHandlebars() {
        System.out.println("hasHandlebars");

    }

    @Override
    public void hasStand() {
        System.out.println("hasStand");

    }

    @Override
    public void hasWheels() {
        System.out.println("has" + noOfTyres + "Wheels");

    }

    @Override
    public void hasEngine() {
        System.out.println("hasEngine");

    }


}
