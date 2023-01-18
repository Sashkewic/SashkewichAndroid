import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;

        switch (day){
            case MONDAY -> {
                notification("Учеба в " + Day.MONDAY.getDescription());
            }

            case TUESDAY -> {
                notification("В " + Day.TUESDAY.getDescription() + "я не учусь");
            }

            case WEDNESDAY ->  {
                notification("Учеба в " + Day.WEDNESDAY.getDescription());
            }

            case THURSDAY ->  {
                notification("В " + Day.THURSDAY.getDescription() + " я не учусь!");
            }

            case FRIDAY ->  {
                notification("Учеба в " + Day.FRIDAY.getDescription());
            }

            case SATURDAY ->  {
                notification("В " + Day.SATURDAY.getDescription() + " я не учусь!");
            }

            case SUNDAY -> {
                notification("В " + Day.SUNDAY.getDescription() + " я не учусь!");
            }
        }
    }

    public static void notification(String message){
        System.out.println(message);
    }
}