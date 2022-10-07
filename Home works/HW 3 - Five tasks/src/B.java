import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        // Задача B - Ввести пять целых чисел, найти максимальное из них.

        Scanner scan = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        System.out.print("Введите пять целых чисел: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        n4 = scan.nextInt();
        n5 = scan.nextInt();

        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
            System.out.println("Максимальное число: " + n1);
        }

        else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
            System.out.println("Максимальное число: " + n2);
        }

        else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
            System.out.println("Максимальное число: " + n3);
        }

        else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
            System.out.println("Максимальное число: " + n4);
        }

        else {
            System.out.println("Максимальное число: " + n5);
        }
    }
}
