package classes;

public class Notebook extends Device{
    static int priceOfNotebook = 20000; // цена

    // геттер(ы) и сеттер(ы)
    public static int getPriceOfNotebook() {
        return priceOfNotebook;
    }
    public static void setPriceOfNotebook(int priceOfNotebook) {
        Notebook.priceOfNotebook = priceOfNotebook;
    }

    // конструктор(ы)
    public Notebook(String model, int price) {
        super(model, price);
        priceOfNotebook += 3000;
    }

    // переопределение(я)
    @Override
    public String toString() {
//        return "Инфо о ноутбуке: " + "\n" +
//                "Модель: " + this.model + "\n" +
//                "Цена: " + price + "\n";
        return "Ноутбук: " + this.price;
    }
}
