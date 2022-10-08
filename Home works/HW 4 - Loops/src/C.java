import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        // Задача С - Напишите программу которая будет получать числа до тех пор пока полученное число позитивное.

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Введите число: ");
            number = sc.nextInt();

            if (number < 0) {
                System.out.print("До свидания!");
            }
        }

        while (number > 0);
    }
}