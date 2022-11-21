public class Bread {
    double weight; // вес хлеба
    int price; // цена хлеба

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void bakeBread() {
        System.out.println("Хлебобулочное изделие испечено");
    }

    public void packBread() {
        System.out.println("Хлебобулочное изделие упаковано");
    }

    public Bread (double weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Обычный хлеб весом " + this.weight + " г " + "и стоимостью " + this.price + " сом " + "готов" + "\n";
    }
}
