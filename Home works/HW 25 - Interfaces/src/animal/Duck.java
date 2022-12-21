package animal;

public class Duck implements Swimable, Eatable{
    private int age; // возраст утки

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Duck(int age){
        this.age = age;
    }


    @Override
    public void eat() {
        System.out.println("Я ем всякое, что помогает мне не сдохнуть!");
    }

    @Override
    public void swim() {
        System.out.println("Утка умеет плавать");
    }

    @Override
    public String toString() {
        return "Утка";
    }
}
