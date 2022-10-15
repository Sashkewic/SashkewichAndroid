import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Урок 6. Массивы.

        Scanner sc = new Scanner(System.in);
        Random randomNum = new Random();
        System.out.print("Какое количество чисел хотите видеть в массиве: ");
        int index = sc.nextInt();
        int[] arrayNum = new int[index]; // количество элементов в массиве (длина массива)
        int min = 160; // минимальное число
        int max = 190; // максимальное число
        int countPeople = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = randomNum.nextInt((max - min) + 1) + min; // формула для поиска случайного числа в диапазоне от 160 до 190 числа

            if (arrayNum[i] > 180 && arrayNum[i] < 190) {
                countPeople++;
            }
        }

//        System.out.println("Количество чисел в массиве: " + arrayNum.length);
//        System.out.println("Все случайные числа, которые добавились в массив: " + Arrays.toString(arrayNum));
        System.out.println("Количество человек c ростом выше 180, но ниже 190: " + countPeople);
    }
}