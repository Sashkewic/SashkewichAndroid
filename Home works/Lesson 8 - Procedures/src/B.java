import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        // Напишите процедуру, которая принимает параметр – натуральное число N – и выводит на экран линию из N символов ‘-’(тире).

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        printTire(sc.nextInt()); // метод принимает аргумент в виде числа - сколько нужно тире распечатать.
    }

    public static void printTire(int countNum) { // создаем метод с аргументом countNum
        String tire = ""; // создаем пустую строку

        for (int i = 1; i <= countNum; i++) { // в зависимости от того, какое число будет в аргументе метода,
            tire += "-"; // столько раз добавляем тире в строку
        }

        System.out.println(tire); // распечатываем строку с тире
    }
}
