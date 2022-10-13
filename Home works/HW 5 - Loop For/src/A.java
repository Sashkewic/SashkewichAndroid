import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        // Задача А - Получить от пользователя число,
        // и вывести на экран таблицу умножения этого числа, используя конструкцию цикла for

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Введите число: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}