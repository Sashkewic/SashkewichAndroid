package task_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrNumbers = new ArrayList();

        for (int i = 1; i <= 100; i++){ // проходим циклом от 1 до 100
            if (i % 2 != 0){ // если число i нечетное
                arrNumbers.add(0, i); // добавляем нечетное число в начало списка
            }

            else { // если число четное
                arrNumbers.add(i); // добавляем четное число в конец списка
            }
        }

        for (int j = arrNumbers.size() - 1; j >= 0; j--){ // проходим по списку от конца до начала
            if (arrNumbers.get(j) % 2 == 0) { // если число четное
                arrNumbers.remove(j); // то четное число удаляем из списка
            }
        }

        System.out.println(arrNumbers);
    }
}
