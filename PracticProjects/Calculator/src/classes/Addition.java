package classes;

import interfaces.Notificationable;


public class Addition extends Calculate implements Notificationable {
    public void addition() {
        this.result = this.result + this.num;
        notification("Результат операции: " + this.num + "\n");
    }

    public Addition(){
        super();
    }

    @Override
    public void notification(String message) {
        System.out.print(message);
    }
}
