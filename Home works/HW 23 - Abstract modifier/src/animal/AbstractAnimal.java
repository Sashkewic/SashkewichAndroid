package animal;

abstract class AbstractAnimal {
    // поля
    protected double weight; // вес животного
    protected int age; // возраст животного
    protected String color; // цвет животного

    protected String voice; // издаваемый звук животного

    // геттер(ы) и сеттер(ы)
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

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }

    // метод(ы)
    public void voice(){
        System.out.println("Животное подает звук: " + this.getVoice() + "\n");
    }

    public void eat(){
        System.out.println("Животное ест!" + "\n");
    }

    public void sleep(){
        System.out.println("Животное спит!" + "\n");
    }

    public AbstractAnimal(double weight, int age, String color, String voice) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.voice = voice;
    }
}
