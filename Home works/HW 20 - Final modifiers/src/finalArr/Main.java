package finalArr;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int [] ARRMUMFINAL = new int[10]; // создаем пустой final массив на 10 чисел

        for (int i = 0; i < ARRMUMFINAL.length; i++) { // проходим по массиву
            ARRMUMFINAL[i] = 1 + (int)(Math.random() * 20); // каждый элемент массива получает случайное число от 1 до 20
        }

        ARRMUMFINAL[0] = 0;
        ARRMUMFINAL[1] = 0;
        ARRMUMFINAL[2] = 0; // первым трем элементам массива присвоили значение 0
        System.out.println(Arrays.toString(ARRMUMFINAL));

        int newArr [] = ARRMUMFINAL; // создаем новый массив, используя ссылку от final массива ARRMUMFINAL
        System.out.println(Arrays.toString(newArr));
    }
}