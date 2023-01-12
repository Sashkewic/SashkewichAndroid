package classes;

import interfaces.Notificationable;

import java.util.Scanner;

public class Multiplication extends Calculate implements Notificationable {
    public void multiply() {
        this.result = this.result * this.num;
        notification("Результат операции: " + this.result + "\n");
    }

    public Multiplication(){}

    @Override
    public void notification(String message) {
        System.out.print(message);
    }
}
