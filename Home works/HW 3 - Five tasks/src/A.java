import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        // Задача A - Ввести три целых числа, найти максимальное из них.

        Scanner scan = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Введите три целых числа: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Максимальное число: " + n1);
        }

        else if (n2 > n1 && n2 > n3) {
            System.out.println("Максимальное число: " + n2);
        }

        else {
            System.out.println("Максимальное число: " + n3);
        }
    }
}
