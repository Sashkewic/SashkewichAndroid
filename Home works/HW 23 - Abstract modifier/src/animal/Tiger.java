package animal;

public class Tiger extends AbstractCats{
    protected String location; // место обитания

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void voice(){
        System.out.println("Тигр издает звук: " + this.getVoice() + "\n");
    }

    public void eat(){
        System.out.println("Тигр ест!" + "\n");
    }

    public void sleep(){
        System.out.println("Тигр спит!" + "\n");
    }

    public Tiger(double weight, int age, String color, String voice, int quantityClaws, double tailLength, int quantityMustache, String location) {
        super(weight, age, color, voice, quantityClaws, tailLength, quantityMustache);
        this.location = location;
    }

    @Override
    public String toString(){
        return "Что мы знаем об этой кошке: " + "\n" +
                "Его вес: " + this.weight + "\n" +
                "Его возраст: " + this.age + "\n" +
                "Его цвет: " + this.color + "\n" +
                "Количество когтей: " + this.quantityClaws + "\n" +
                "Длина хвоста: " + this.tailLength + "\n" +
                "Количество усов: " + this.quantityMustache + "\n" +
                "Место обитания: " + this.location + "\n";
    }
}
