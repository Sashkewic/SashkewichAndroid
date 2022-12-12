package dog;

public class Dog {
    String name; // имя собаки
    double weight; // вес собаки

    // геттеры и сеттеры
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Методы
    public final void vote() { // Метод, который нельзя переопределить (благодаря ключ. слову final)
        System.out.println("Гав-гав!" + "\n");
    }

    // Конструктор
    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Имя собаки: " + this.name + "\n" +
                "Вес собаки: " + this.weight;
    }
}
