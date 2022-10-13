import java.util.Scanner;

public class С {
    public static void main(String[] args) {
        // Задача С - Написать программу, которая получает числа, до тех пор, пока пользователь не введёт 0.
        // После ввода 0, отобразить в консоль количество введенных чисел(не считая 0), их сумму и общее арифметическое

        Scanner sc = new Scanner(System.in);
        int num = 1; // принимает число от пользователя
        int count; // счетчик, который принимает в себе введенные пользователем числа, больше 0
        int sumNum = 0; // здесь будет храниться сумма всех введенных чисел
        double avg = 0; // здесь будет храниться среднее арифметическое всех введенных чисел

        for (count = 0; num != 0; count++) {
            System.out.print("Введите число: ");
            num = sc.nextInt();
            sumNum += num;

            if (num == 0) {
                avg = sumNum / count;
                sc.close();
            }
        }

        System.out.println("Количество введенных чисел: " + count);
        System.out.println("Сумма: " + sumNum);
        System.out.println("Среднее арифметическое: " + avg);
    }
}
