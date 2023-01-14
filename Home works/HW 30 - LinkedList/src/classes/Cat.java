package classes;

import interfaces.Voiceable;

public class Cat extends Animal implements Voiceable {
    static double catsAge = 0.5; // изначальный возраст кошки

    // геттеры и сеттеры
    public static double getCatsAge() {
        return catsAge;
    }

    public static void setCatsAge(double catsAge) {
        Cat.catsAge = catsAge;
    }

    // конструктор
    public Cat(String name, double age) {
        super(name, age);
        catsAge += 0.2;
    }

    // реализация метода(ов)
    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
