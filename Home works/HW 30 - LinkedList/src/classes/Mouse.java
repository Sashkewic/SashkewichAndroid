package classes;

import interfaces.Voiceable;

public class Mouse extends Animal implements Voiceable {
    static double mouseAge = 0.5; // изначальный возраст мышек

    public static double getMouseAge() {
        return mouseAge;
    }
    public static void setMouseAge(double mouseAge) {
        Mouse.mouseAge = mouseAge;
    }

    // конструктор
    public Mouse(String name, double age) {
        super(name, age);
        mouseAge += 0.2;
    }

    // реализация метода(ов)
    @Override
    public void voice() {
        System.out.println("Пи-пи-пи!");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
