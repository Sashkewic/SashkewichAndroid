import java.util.Arrays;
import java.util.Scanner;

public class С {
    public static void main(String[] args) {
        // Написать процедуру, которая получает массив в качестве переменной, и увеличивает каждый его элемент на единицу. Воспроизвести вызов в основной программе.
        Scanner sc = new Scanner(System.in);

        System.out.print("Какой длины массив вы хотите: ");
        int count = sc.nextInt(); // будет принимать длину массива

        int[] arrayNum = new int[count]; // создаем массив длиной в count

        for (int i = 0; i < arrayNum.length; i++) { // проходим по массиву
            arrayNum[i] = i; // передаем числа элементам массива
        }

        System.out.println("Массив до преобразования: " + Arrays.toString(arrayNum)); // печатаем первоначальный массив
        modArray(count); // запуск процедуры преобразования массива, где аргумент - какой длины массив мы хотим создать
    }

    public static void modArray(int num) { // создаем метод с аргументом num
        int[] numArray = new int[num]; // // передаем массив длиной в num

        for (int i = 0; i < num; i++) { // в зависимости от того, какой длины массив будет в аргументе метода,
            numArray[i] += i + 1; // каждому элементу в массиве добавляем 1.
        }

        System.out.println("Массив после преобразования: " + Arrays.toString(numArray)); // печатаем измененный массив
    }
}
