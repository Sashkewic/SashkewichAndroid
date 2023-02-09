package classes.factories;

import classes.interfaces.Coupe;
import classes.interfaces.Sedan;
import classes.interfaces.carsFactory;
import classes.models.FordCoupe;
import classes.models.FordSedan;

public class FordFactory implements carsFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }

    public FordFactory(){}
}
