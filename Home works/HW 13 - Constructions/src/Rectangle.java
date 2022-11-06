// Создайте класс прямоугольника.
// Создайте свойства, объявите геттеры и сеттеры для этих свойств.
// Создайте конструктор для вашего класса.

public class Rectangle {
    int a; // первая сторона прямоугльника
    int b; // вторая сторона прямоугльника

    public int getA() { // геттер стороны a прямоугольника
        return a;
    }
    public void setA(int a) { // сеттер стороны a прямоугольника
        this.a = a;
    }

    public int getB() { // геттер стороны b прямоугольника
        return b;
    }
    public void setB(int b) { // сеттер стороны b прямоугольника
        this.b = b;
    }

    public Rectangle(int a, int b) { // конструктор класса Rectangle
        this.a = a;
        this.b = b;
    }
}


