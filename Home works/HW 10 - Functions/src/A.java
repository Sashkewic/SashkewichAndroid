import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        //Написать функцию, которая вычисляет сумму цифр числа, возвращает ее пользователю.
        // Если сумма больше 1000 написать в консоль сообщение, что сумма больше 1000.
        sumNumsinNum();
    }

    static int sumNumsinNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; // получаем остаток от деления числа на 10,
            sum = sum + digit; // и прибавляем этот остаток к остальным отстаткам,
            num = num / 10; // а само число делим на 10,
            // и это делается до тех пор, пока число (num) не станет 0.
        }

        if (sum > 1000) {
            System.out.println("Сумма чисел больше 1000");
        }

        else {
            System.out.println(sum);
        }

        return num;
    }
}