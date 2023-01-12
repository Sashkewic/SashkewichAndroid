package classes;

import interfaces.Voiceable;

public class Mouse implements Voiceable {
    private String name;
    private double age;

    // геттеры и сеттеры
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    // конструктор
    public Mouse(String name, double age) {
        this.name = name;
        this.age = age;
    }

    // реализация метода(ов)
    @Override
    public void voice() {
        System.out.println("Пи-пи-пи!");
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + "," + " Возраст: " + this.age;
    }
}
