//  Создать класс Круг. Создать переменные (свойства): радиус, цвет и прозрачен ли?.
//  Создать геттеры и сеттеры.
//  Создать метод получения длины круга (периметр) по формуле 2*3.14*R (2пr)
//  Создать метод получения площади круга по формуле 3.14*R*R (пr*r)
// По умолчанию: Круг не прозрачен

public class Circle {
    int radius;
    String color;
    boolean transparency;

    public int getRadius() {
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

    public boolean isTransparency() {
        return transparency;
    }

    public void setTransparency(boolean transparency) {
        this.transparency = transparency;
    }

    public double curclePerimeter() { // метод получения длины круга (периметр) по формуле 2*3.14*R (2пr)
        return 2 * 3.14 * this.radius;
    }

    public double curcleSquare() { // метод получения площади круга по формуле 3.14*R*R (пr*r)
        return 3.14 * this.radius * this.radius;
    }

    public Circle (int radius) { // Один обязательный параметр: радиус
        this.radius = radius;
    }

    public Circle (int radius, String color) { // Два обязательных параметра: радиус и цвет
        this.radius = radius;
        this.color = color;
    }

    public Circle (int radius, String color, boolean transparency) { // Три обязательных параметра: радиус, цвет, прозрачность
        this.radius = radius;
        this.color = color;
        this.transparency = transparency;
    }

    public Circle () { // По умолчанию: Круг не прозрачен
        this.transparency = false;
    }
}
