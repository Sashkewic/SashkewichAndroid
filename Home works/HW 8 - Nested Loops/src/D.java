import java.util.Random;

public class D {
    public static void main(String[] args) {
        // Напишите программу, которая заполняет квадратную матрицу случайными числами в интервале [10,99]
        // и находит максимальный и минимальный элементы в матрице и их индексы
        Random random = new Random();
        int [] [] matric = new int[4][4]; // создаем матрицу в 4 строки и 4 столбца
        int maxMatricNum = 0; // здесь будет храниться наибольшее число в матрице

        int diff = (99 - 10) + 1 + 10; // формула поиска случайного числа в диапазоне [10, 99]

        for (int i = 0; i < 4; i++) { // проходим по строкам
            for (int j = 0; j < 4; j++) { // проходим по столбцам
                matric[i][j] = random.nextInt(diff); // каждый элемент матрицы получает значение
                System.out.print(matric[i][j] + " "); // печатаем матрицу
            }
            System.out.println();
        }

        int minMatricNum = matric[0][0]; // самое первое число матрицы

        for (int i = 0; i < 4; i++) { // проходим по строкам
            for (int j = 0; j < 4; j++) { // проходим по столбцам
                if (matric[i][j] > maxMatricNum) { // если значение элемента матрицы больше чем максимальное число матрицы,
                    maxMatricNum = matric[i][j]; // то меняется максимальное значение
                }

                else if (matric[i][j] < minMatricNum) { // если значение элемента матрицы меньше чем минимальное значение матрицы,
                    minMatricNum = matric[i][j]; // то меняется минимальное значение
                }
            }
        }

        System.out.println("Максимальный элемент: " + maxMatricNum);
        System.out.println("Минимальный элемент: " + minMatricNum);
    }
}
