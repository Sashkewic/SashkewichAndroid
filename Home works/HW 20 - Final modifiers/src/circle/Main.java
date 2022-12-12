package circle;
import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры кругов, выставляем им радиус и цвет
        Circle circle1 = new Circle(60, 60, 50, 55, 30, "Красный");
        Circle circle2 = new Circle(90, 90, 65, 65, 40, "Зеленый");
        Circle circle3 = new Circle(45, 45, 70, 70, 90, "Красный");
        Circle circle4 = new Circle(55, 50, 90, 90, 95, "Синий");
        Circle circle5 = new Circle(35, 35, 55, 55, 90, "Желтый");
        Circle circle6 = new Circle(60, 60, 100, 100, 120, "Желтый");
        Circle circle7 = new Circle(80, 85, 120, 120, 140, "Черный");
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(circle7);
        frame.setVisible(true);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle4);
        System.out.println(circle5);
        System.out.println(circle6);
        System.out.println(circle7);

        final Circle circles[] = new Circle[7];
        circles[0] = circle1;
        circles[1] = circle2;
        circles[2] = circle3;
        circles[3] = circle4;
        circles[4] = circle5;
        circles[5] = circle6;
        circles[6] = circle7;
        Object newArrCircles[] = circles;
        System.out.println(Arrays.toString(newArrCircles));
    }
}
