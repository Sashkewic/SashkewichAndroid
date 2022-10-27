import java.util.Random;

public class D {
    public static void main(String[] args) {
        // Напишите программу, которая заполняет квадратную матрицу случайными числами в интервале [10,99]
        // и находит максимальный и минимальный элементы в матрице и их индексы
        Random random = new Random();
        int [] [] matric = new int[4][4];
        int minMatricNum = 0;
        int maxMatricNum = 0;

        int min = 10;
        int max = 99;
        int diff = (max - min + 1) + min;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matric[i][j] = random.nextInt(diff);
                System.out.print(matric[i][j] + " ");

            }
            System.out.println();
        }
    }
}
