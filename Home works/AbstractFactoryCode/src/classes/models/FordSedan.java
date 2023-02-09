package classes.models;

import classes.interfaces.Sedan;

public class FordSedan implements Sedan {
    String name = "Ford Sedan";
    public FordSedan() {
        System.out.println("Create FordSedan");
    }
}
