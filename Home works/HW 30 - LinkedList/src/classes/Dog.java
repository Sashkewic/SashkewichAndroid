package classes;

import interfaces.Voiceable;

public class Dog extends Animal implements Voiceable {
    static double dogsAge = 0.5; // изначальный возраст собаки

    // геттеры и сеттеры

    public static double getDogsAge() {
        return dogsAge;
    }
    public static void setDogsAge(double dogsAge) {
        Dog.dogsAge = dogsAge;
    }

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
        super(name, age);
        dogsAge += 0.2;
    }

    // реализация метода(ов)
    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
