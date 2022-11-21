public class Baguette extends Bread{
    double length; // длина багета (в см)
    int pieces; // количество кусков (рубленных частей)
    String name; // название багета


    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public int getPieces() {
        return pieces;
    }
    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Baguette(double weight, double length, int pieces, String name, int price) {
        super(weight, price);
        this.length = length;
        this.pieces = pieces;
        this.name = name;
    }

    public void bakeBaguette() {
        super.bakeBread();
    }

    public void divideBaguette() {
        System.out.printf("Багет разделен на %d частей \n", pieces);
    }

    public void packBaguette() {
        System.out.println("Багет упакован только в экологичный пакет");
    }

    @Override
    public String toString() {
        return "Багет весом " + this.weight + " г, " + "длиной " + this.length + " см, " + "порубленный на " + this.pieces + " шт, " + "имеющий название: " + this.name + ", " + "и стомостью " + this.price + " сом, " + "готов" + "\n";
    }
}
