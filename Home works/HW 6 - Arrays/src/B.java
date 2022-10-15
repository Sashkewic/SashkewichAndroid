import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        // Задача В - Заполните массив случайными числами в интервале от 0 до 100 включительно
        // и подсчитайте отдельно среднее значение всех элементов, которые <50, и среднее значение всех элементов, которые ≥50.

        Scanner sc = new Scanner(System.in);

        System.out.print("Сколько чисел хотите разместить в массиве?: ");
        int[] numArray = new int[sc.nextInt()]; // количество элементов в массиве (длина массива)
        int sumNumArrayLess50 = 0; // Тут будут суммироваться числа, меньше 50
        int sumNumArrayMore50 = 0; // Тут будут суммироваться числа, равные 50 и больше

        float avgNumArrayLess50 = 0; // Среднее арифметическое массива с числами, меньше 50
        float avgNumArrayMore50 = 0; // Среднее арифметическое массива с числами, равными 50 и больше

        int countLess50 = 0; // Счетчик чисел, меньше чем 50
        int countMore50 = 0; // Счетчик чисел, равный или более чем 50

        Random random = new Random();
        int min = 0; // минимальное число в диапазоне
        int max = 100; // максимальное число в диапазоне
        int randomNumber = (max - min + 1) + min; // формула для поиска случайного числа между min и max

        for (int i = 0; i <= numArray.length - 1; i++) {
            numArray[i] = random.nextInt(randomNumber); // индекс массива получает случайное число от 0 до 100

            if (numArray[i] < 50) { // если у индекса массива число меньше 50,
                sumNumArrayLess50 += numArray[i]; // то прибавляем это число к остальным числам, которые меньше 50
                countLess50++; // а счетчик чисел, меньше 50 - увеличивается на 1
                avgNumArrayLess50 = sumNumArrayLess50 / countLess50; // здесь мы получаем среднее арифм-ое чисел, которые меньше 50
            }

            else if (numArray[i] >= 50) { // если у индекса массива число равно или больше 50,
                sumNumArrayMore50 += numArray[i]; // то прибавляем это число к остальным числам, которые равны или больше 50,
                countMore50++; // а счетчик чисел, равен или больше 50 - увеличивается на 1,
                avgNumArrayMore50 = sumNumArrayMore50 / countMore50; // здесь мы получаем среднее арифм-ое чисел, которые равно или больше 50.
            }
        }

        System.out.println("Массив: " + Arrays.toString(numArray)); // выводим в консоль весь полученный массив с числами
        System.out.println("Среднее арифметическое элементов [0, 49]: " + avgNumArrayLess50); // выводим в консоль среднее арифм-ое чисел, которые меньше 50.
        System.out.println("Среднее арифметическое элементов [50, 10]: " + avgNumArrayMore50); // выводим в консоль среднее арифм-ое чисел, которые равно или больше 50.
    }
}
