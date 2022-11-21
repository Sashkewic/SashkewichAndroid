public class Pita extends Bread{

    double radius; // радиус лаваша
    String name; // название лаваша

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Pita(double weight, double radius, String name, int price) {
        super(weight, price);
        this.radius = radius;
        this.name = name;
    }

    public void bakePita() {
        System.out.println("Я лаваш, меня испекли");
    }

    public void wrap() { // метод, который заворачивает лаваш
        System.out.println("Лаваш завернули");
    }

    public void packPita() {
        super.packBread();
    }

    @Override
    public String toString() {
        return "Лаваш весом " + this.weight + " г, " + "радиусом " + this.radius + " см, " + "с названием: " + this.name + ", " + "и стомостью " + this.price + " сом, " + "готов" + "\n";
    }
}
