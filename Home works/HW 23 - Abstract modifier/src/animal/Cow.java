package animal;

public class Cow extends AbstractAnimal{
    // поля (свойства)
    protected String name; // имя коровы
    protected String owner; // владелец коровы

    // геттер(ы) и сеттер(ы)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // метод(ы)
    public void voice(){
        System.out.println("Корова издает звук: " + this.getVoice() + "\n");
    }

    public void eat(){
        System.out.println("Корова ест!" + "\n");
    }

    public void sleep(){
        System.out.println("Корова спит!" + "\n");
    }

    // конструктор(ы)
    public Cow(double weight, int age, String color, String voice, String name, String owner){
        super(weight, age, color, voice);
        this.name = name;
        this.owner = owner;
    }

    // информация об обьекте через toString
    @Override
    public String toString(){
        return "Что мы знаем об этой корове: " + "\n" +
                "Ее вес: " + this.weight + "\n" +
                "Ее возраст: " + this.age + "\n" +
                "Ее цвет: " + this.color + "\n" +
                "Ее издаваемый звук: " + this.voice + "\n" +
                "Ее кличка: " + this.name + "\n" +
                "Ее владелец: " + this.owner + "\n";
    }
}
