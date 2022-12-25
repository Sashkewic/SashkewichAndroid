package task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrSquareNumbers = new ArrayList();
        ArrayList<Integer> arrMultiple2And3 = new ArrayList();

        for (int i = 0; i <= 10000; i++){ // проходим в цикле от 1 до 10000
            if (Math.sqrt(i) == (int) Math.sqrt(i)){ // если квадратный корень числа i равен целому числу
                arrSquareNumbers.add(i); // то число i помещаем в список квадратов
            }

            else if (i % 2 == 0 || i % 3 == 0) { // если число i кратно 2 или 3
                arrMultiple2And3.add(i); // то число i помещаем в список кратных чисел
            }
        }

        System.out.println("Список квадратов: " + arrSquareNumbers);
        System.out.println("Список чисел, кратных 2 или 3: " + arrMultiple2And3);
    }
}