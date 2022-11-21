public class Cake extends Bread{
    double radius; // радиус лепешки

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cake(double weight, double radius, int price) {
        super(weight, price);
        this.radius = radius;
    }

    public void applyPatterns() { // метод, который наносит узор на лепешку
        System.out.println("Узор на лепешку нанесен");
    }

    public void varnish() { // метод, который наносит лак на лепешку
        System.out.println("Лак на лепешку нанесен");
    }

    public void bakeCake() {
        super.bakeBread();
    }

    public void packCake() {
        super.packBread();
    }

    @Override
    public String toString() {
        return "Лепешка весом " + this.weight + " г, " + "радиусом " + this.radius + " см, " + "и стомостью " + this.price + " сом " + "готова" + "\n";
    }
}
