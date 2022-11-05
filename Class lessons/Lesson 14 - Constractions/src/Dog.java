public class Dog {
    String breed;

    String sex;

    String name;
    int age;
    double weight;

    public Dog(String breed, String sex, String name, int age, double weight) { // конструктор с пятью обязательными параметрами
        this.breed = breed;
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String breed, String sex, String name) { // конструктор с тремя обязательными параметрами
        this.breed = breed;
        this.sex = sex;
        this.name = name;
    }

    public Dog() { // конструктор без обязательных параметров
    }

    public String getBreed() {
        return this.breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
