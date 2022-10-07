import java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите координаты точки А: ");
        double x1 = scan.nextDouble(); // вводим координату точки x по горизонтали
        double x2 = scan.nextDouble(); // вводим координату точки x по вертикали
        System.out.print("Введите координаты точки B: ");
        double y1 = scan.nextDouble(); // вводим координату точки y по горизонтали
        double y2 = scan.nextDouble(); // вводим координату точки y по горизонтали

        double ab = Math.sqrt(Math.pow(x1, 2) - (Math.pow(x2, 2)) + (Math.pow(y1, 2) - (Math.pow(y2, 2))));
        System.out.printf("Длина отрезка АВ = %.2f", ab); // выводим результат через форматирование + округляем до сотых
    }
}