import java.util.Random;

public class C {
    public static void main(String[] args) {
        // Напишите программу, которая заполняет квадратную матрицу случайными числами в интервале [1,9] и находит среднее арифметическое всех элементов.
        Random random = new Random();
        int [] [] matric = new int[3][3];
        int min = 1;
        int max = 10;
        float sum = 0;

        int diff = (max - min + 1) - min;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    matric[i][j] = random.nextInt(diff);
                    System.out.print(matric[i][j] + " ");
                    sum += matric[i][j];
            }
            System.out.println();
        }

        float avg = sum / 9;
        System.out.println("Среднее арифметическое: " + avg);
    }
}
