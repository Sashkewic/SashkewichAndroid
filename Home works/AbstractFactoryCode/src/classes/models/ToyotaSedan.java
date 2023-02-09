package classes.models;

import classes.interfaces.Sedan;

public class ToyotaSedan implements Sedan {
    String name = "Toyota Sedan";
    public ToyotaSedan() {
        System.out.println("Create Toyota Sedan");
    }
}