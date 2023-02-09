package classes.factories;

import classes.interfaces.Coupe;
import classes.interfaces.Sedan;
import classes.interfaces.carsFactory;
import classes.models.ToyotaCoupe;
import classes.models.ToyotaSedan;

public class ToyotaFactory implements carsFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }

    public ToyotaFactory(){}
}