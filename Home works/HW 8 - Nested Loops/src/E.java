import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
       // Введите массив с клавиатуры и найдите (за один проход) количество элементов, имеющих максимальное значение
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int nums = sc.nextInt(); // какая будет длина массива
        int [] numsArr = new int[nums]; // создаем массив
        int countBigNums = 0; // количество самых больших чисел массива
        int big = numsArr[0]; // Берём за большее первое число


        System.out.print("Введите числа в массив: ");
        for (int i = 0; i < numsArr.length; i++) { // проходим по массиву
            numsArr[i] = sc.nextInt(); // присваиваем каждому элементу число
        }

        for (int j = 0; j < numsArr.length; j++) { // проходим по массиву
            if (numsArr[j] > big) { // если число больше самого большого
                big = numsArr[j]; // самое большое число меняется
                countBigNums = 1; // количество самых больших чисел становится 1
            }
            else if (numsArr[j] == big) { // если число равно самому большому числу в массиве
                countBigNums += 1; // количество самых больших чисел массива увеличивается на 1
            }

            else if (numsArr[j] < big) { // если число меньше самомо большого числа в массиве
                countBigNums += 0; // количество самых больших чисел массива не увеличивается
            }
        }

        System.out.println("Массив: " + Arrays.toString(numsArr));
        System.out.println("Максимальное значение: " + big);
        System.out.println("Количество элементов: " + countBigNums);
    }
}
