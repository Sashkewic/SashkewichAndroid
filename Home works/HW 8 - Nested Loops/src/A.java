import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        // Напишите программу, которая получает натуральные числа A и B (A < B) и выводит все простые числа в интервале от A до B.
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число А: ");
        int numA = sc.nextInt();

        System.out.print("Введите число B: ");
        int numB = sc.nextInt();

        for (int i = numA; i < numB; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count < 3) {
                System.out.print(i + " ");
            }
        }

    }
}