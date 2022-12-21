package board;

public class blackBoard extends Board{
    private String color; // цвет доски

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public blackBoard(String material, String countryMaker, String color) {
        super(material, countryMaker);
        this.color = color;
    }
}
