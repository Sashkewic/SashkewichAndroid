import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        // Напишите программу, которая получает возраст человека (целое число, не превышающее 120)
        // и выводит этот возраст со словом «год», «года» или «лет». Например, «21 год», «22 года», «25 лет».

        Scanner scan = new Scanner(System.in);
        int age;

        System.out.print("Введите возраст: ");
        age = scan.nextInt();
        int count = age % 10;

        if (count == 1 && age != 11 && age < 120) {
            System.out.printf("Вам %d год", age);
        }

        else if (count < 5 && count != 0 && age != 11 && age < 120) {
            System.out.printf("Вам %d года", age);
        }

        else if (age > 120) {
            System.out.println("Столько не живут XD");
        }

        else {
            System.out.printf("Вам %d лет", age);
        }
    }
}
