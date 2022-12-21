package board;

public class Board {
    // поля
    protected String material; // из какого материала сделана доска
    protected String countryMaker; // страна-изготовитель доски

    // геттер(ы) и сеттер(ы)
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCountryMaker(String countryMaker) {
        this.countryMaker = countryMaker;
    }
    public String getCountryMaker() {
        return countryMaker;
    }

    // метод(ы)

    public Board(String material, String countryMaker) {
        this.material = material;
        this.countryMaker = countryMaker;
    }

    @Override
    public String toString() {
        return "Материал доски: " + this.getMaterial() + "\n" +
                "Страна-изготовитель доски: " + this.getCountryMaker();
    }
}
