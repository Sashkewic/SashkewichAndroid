package classes;

public abstract class Device {
    protected String model; // модель
    protected int price; // цена
    protected int discount; // скидка на устройство

    // геттер(ы) и сеттер(ы)

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // конструктор(ы)
    public Device(String model, int price){
        this.model = model;
        this.price = price;
    }
}
