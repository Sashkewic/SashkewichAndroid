import classes.factories.ToyotaFactory;
import classes.interfaces.carsFactory;

public class Main {
    public static void main(String[] args) {
        carsFactory factory;
        factory = new ToyotaFactory();
        factory.createSedan();
    }
}