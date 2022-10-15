import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        // Задача А - Заполните массив случайными числами в интервале от 0 до 100 включительно,
        // и найдите среднее арифметическое его значений

        Scanner sc = new Scanner(System.in);

        System.out.print("Сколько чисел хотите разместить в массиве?: ");
        int[] numArray = new int[sc.nextInt()]; // количество элементов в массиве (длина массива)
        int sumNumArray = 0; // Сумма всех чисел в массиве
        float avg = 0; // Среднее арифметическое массива

        Random random = new Random();
        int min = 0; // минимальное число в диапазоне
        int max = 100; // максимальное число в диапазоне
        int randomNumber = (max - min + 1) + min; // формула для поиска случайного числа между min и max

        for (int i = 0; i <= numArray.length - 1; i++) {
            numArray[i] = random.nextInt(randomNumber);
            sumNumArray = sumNumArray + numArray[i];
            avg = sumNumArray / numArray.length;
        }
        System.out.println("Массив: " + Arrays.toString(numArray));
        System.out.printf("Среднее арифметическое: %.1f", avg);
    }
}