import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        // Задача В - Написать программу,
        // которая получает диапазон чисел от пользователя и суммирует все нечётные числа в данном диапазоне.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int num1, num2, sumOddNumbers;

        num1 = sc.nextInt(); // Вводим первое число, к примеру 10
        num2 = sc.nextInt(); // Вводим второе число, к примеру 20

        sumOddNumbers = 0; // Здесь будет сумма нечетных чисел


        for (int count = num1; count <= num2; count++) { // count = num1 = 10, 10 <= 20; count = 10 + 1;
            num1 = count; // num1 принимает значение count, от 10 до 20, в течении цикла
            if (num1 % 2 != 0) { // если num1 не делится без остатка на 2,
                sumOddNumbers += num1; // то это число считается нечетным, и суммируется с остальными нечетными числами.
            }
        }

        System.out.printf("Сумма нечетных чисел в диапазоне: %d", sumOddNumbers);
    }
}
