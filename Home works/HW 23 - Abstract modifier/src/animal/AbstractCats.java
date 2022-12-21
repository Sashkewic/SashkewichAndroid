package animal;

abstract class AbstractCats extends AbstractAnimal{
    protected int quantityClaws; // количество когтей у кошки
    protected double tailLength; // длина хвоста у кошки
    protected int quantityMustache; // количество усов у кошки

    // геттер(ы) и сеттер(ы)
    public int getQuantityClaws() {
        return quantityClaws;
    }
    public void setQuantityClaws(int quantityClaws) {
        this.quantityClaws = quantityClaws;
    }

    public double getTailLength() {
        return tailLength;
    }
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getQuantityMustache() {
        return quantityMustache;
    }
    public void setQuantityMustache(int quantityMustache) {
        this.quantityMustache = quantityMustache;
    }

    // метод(ы)

    private void mur(){
        System.out.println("Кошка мурлыкает" + "\n");
    }

    public void sharpenClaws(){
        System.out.println("Кошка точит когти" + "\n");
    }

    public void landOnFeet() {
        System.out.println("Кошка приземлилась на лапы после падения" + "\n");
    }

    public void hi(){
        mur();
        sharpenClaws();
        landOnFeet();
    }

    public AbstractCats(double weight, int age, String color, String voice, int quantityClaws, double tailLength, int quantityMustache) {
        super(weight, age, color, voice);
        this.quantityClaws = quantityClaws;
        this.tailLength = tailLength;
        this.quantityMustache = quantityMustache;
    }
}
