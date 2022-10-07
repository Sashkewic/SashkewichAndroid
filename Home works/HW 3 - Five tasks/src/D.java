import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        // Задача D - Напишите программу, которая получает три числа и выводит количество одинаковых чисел в этой цепочке
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Введите три числа: ");

        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.print("Все числа одинаковые");
        }

        else if (n1 == n2 || n2 == n3 || n1 == n3) {
            System.out.print("Два числа одинаковы");
        }

        else {
            System.out.print("Все числа разные");
        }
    }
}