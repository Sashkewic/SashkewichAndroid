package classes.models;

import classes.interfaces.Coupe;

public class ToyotaCoupe implements Coupe {
    String name = "Toyota Coupe";
    public ToyotaCoupe() {
        System.out.println("Create Toyota Coupe");
    }
}
