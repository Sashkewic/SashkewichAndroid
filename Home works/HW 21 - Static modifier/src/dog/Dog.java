package dog;

public class Dog {
    // поля
    private String name;
    private double weight;
    private int age;

    private static int countofDogs;


    // геттер(ы) и сеттер(ы)
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static int getCountofDogs() {
        return countofDogs;
    }
    public static void setCountofDogs(int countofDogs) {
        Dog.countofDogs = countofDogs;
    }

    // метод(ы)

    // конструктор(ы)
    public Dog(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        countofDogs++;
    }

    // переопределения методов

    @Override
    public String toString() {
        return "Имя собаки: " + this.name + "\n" +
                "Вес собаки: " + this.weight + " кг" + "\n" +
                "Возраст собаки: " + this.age + " лет" + "\n";
    }
}
