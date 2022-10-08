import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        // Задача D - Ввести натуральное число и определить, верно ли, что в его записи есть две одинаковые цифры, стоящие рядом

        Scanner sc = new Scanner(System.in);

        int number, number1, count;
        System.out.print("Введите натуральное число: ");
        number = sc.nextInt(); // получаем число

        number1 = number % 10; // под пер-ной num1 получаем остаток
        number = Math.floorDiv(number, 10); // получаем целое число, выкинув остаток

        count = 0; //счетчик

        while (number > 0) { // пока число больше 0
            int number2 = number % 10;

            if (number1 == number2) {
                count ++;
            }

            number = Math.floorDiv(number, 10);
            number1 = number2;
        }

        if (count > 0) {
            System.out.print("Да");
        }

        else {
            System.out.print("Нет");
        }
    }
}