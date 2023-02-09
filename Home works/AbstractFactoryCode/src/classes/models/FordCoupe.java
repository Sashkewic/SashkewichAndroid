package classes.models;

import classes.interfaces.Coupe;

public class FordCoupe implements Coupe {
    String name = "Ford Coupe";
    public FordCoupe() {
        System.out.println("Create FordCoupe");
    }
}
