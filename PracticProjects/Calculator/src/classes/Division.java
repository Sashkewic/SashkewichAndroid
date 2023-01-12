package classes;

import interfaces.Notificationable;

import java.util.Scanner;

public class Division extends Calculate implements Notificationable {

    public void divide() {
        this.result = this.result / this.num;
        notification("Результат операции: " + this.result + "\n");
    }

    public Division(){}

    @Override
    public void notification(String message) {
        System.out.print(message);
    }
}
