package classes;

public class Computer extends Device{
    double monitorDiagonal; // диагональ монитора компьютера
    static int priceOfComputer = 25000; // цена

    // геттер(ы) и сеттер(ы)
    public double getMonitorDiagonal() {
        return monitorDiagonal;
    }
    public void setMonitorDiagonal(double monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public static int getPriceOfComputer() {
        return priceOfComputer;
    }
    public static void setPriceOfComputer(int priceOfComputer) {
        Computer.priceOfComputer = priceOfComputer;
    }

    // конструктор(ы)
    public Computer(String model, int price, double monitorDiagonal) {
        super(model, price);
        this.monitorDiagonal = monitorDiagonal;
        priceOfComputer += 6000;
    }

    // переопределение(я)

    @Override
    public String toString() {
//        return "Инфо о компьютере: " + "\n" +
//                "Модель: " + this.model + "\n" +
//                "Диагональ: " + this.monitorDiagonal + "'" + "\n" +
//                "Цена: " + price + "\n";

        return "Компьютер: " + this.price;
    }
}
