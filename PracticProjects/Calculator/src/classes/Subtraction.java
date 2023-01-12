package classes;

import interfaces.Notificationable;

import java.util.Scanner;

public class Subtraction extends Calculate implements Notificationable {
    public void subtract() {
        this.result = this.result - this.num;
        notification("Результат операции: " + this.result + "\n");
    }

    public Subtraction(){}

    @Override
    public void notification(String message) {
        System.out.print(message);
    }
}
