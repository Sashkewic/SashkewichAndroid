package classes;

import interfaces.Voiceable;

public class Dog implements Voiceable {
    static int index;
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
    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
        index++;
    }

    // реализация метода(ов)
    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + "," + " Возраст: " + this.age;
    }
}
