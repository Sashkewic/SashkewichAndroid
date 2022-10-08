import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        // Задача B - Напишите программу которая получает два целых числа и находит их произведение, не используя операцию умножения.
        // Учтите, что числа могут быть отрицательными.

        Scanner sc = new Scanner(System.in);

        int n1, n2, count, answer;
        System.out.print("Введите два числа: ");

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        count = 0; // счетчик
        answer = 0; // будущий ответ

        if (n1 < 0 && n2 < 0) { // если оба числа отрицательны
            n1 = -n1; // первое число становится со знаком -
            n2 = -n2; // второе число становится со знаком -
        }

        while (count < n2) { // пока счетчик не станет больше, чем второе число
            answer += n1; // ответ увеличивается на первое число
            count +=1; // увеличиваем счетчик на 1
        }

        System.out.println(n1 + " * " + n2 + " = " + answer);
    }
}