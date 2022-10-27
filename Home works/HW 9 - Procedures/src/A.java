import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        // Напишите программу выводящую среднее арифметическое двух чисел


        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float n1 = sc.nextFloat(); // получаем первое число

        System.out.print("Введите второе число: ");
        float n2 = sc.nextFloat(); // получаем второе число

        average(n1, n2); // вызываем метод, где в качестве двух чисел - n1 и n2
    }

    public static void average(float x, float y) { // создаем метод с аргументам х и y
        float avg = (x + y) / 2; // получаем среднее арифметическое двух чисел
        System.out.printf("Среднее арифметическое чисел %.0f и %.0f: %.1f", x, y, avg); // печатаем результат операции
    }
}