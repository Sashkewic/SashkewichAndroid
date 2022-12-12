package circle;
import java.awt.*;

public class Circle extends Canvas {
    // поля объекта Circle
    private final double PI = 3.14;
    private int radius;
    private String color;

    private int coordX;
    private int coordY;
    private int heightCircle;
    private int widthCircle;


    // геттеры и сеттеры
    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getCoordX() {
        return coordX;
    }
    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }
    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getHeightCircle() {
        return heightCircle;
    }
    public void setHeightCircle(int heightCircle) {
        this.heightCircle = heightCircle;
    }

    public int getWidthCircle() {
        return widthCircle;
    }
    public void setWidthCircle(int widthCircle) {
        this.widthCircle = widthCircle;
    }

    // Методы
    public double getSquare() {
        return PI * (radius * radius);
    }

    public double getLength() {
        return 2 * radius * PI;
    }

    // Конструкторы
    public Circle (int x, int y, int heightCircle, int widthCircle, int radius, String color) {
        this.coordX = x;
        this.coordY = y;
        this.heightCircle = heightCircle;
        this.widthCircle = widthCircle;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Цвет: " + this.color + "\n" +
                "Площадь: " + getSquare() + "\n" +
                "Периметр: " + getLength() + "\n";
    }

    public void paint(Graphics graphics) {
        switch (this.color) {
            case "Красный" -> graphics.setColor(Color.RED);
            case "Черный" -> graphics.setColor(Color.BLACK);
            case "Синий" -> graphics.setColor(Color.BLUE);
            case "Зеленый" -> graphics.setColor(Color.GREEN);
            case "Желтый" -> graphics.setColor(Color.YELLOW);
        }
        graphics.fillOval(coordX, coordY, widthCircle, heightCircle);
    }
}
