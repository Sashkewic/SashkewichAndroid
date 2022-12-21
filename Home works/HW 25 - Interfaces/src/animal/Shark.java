package animal;

public class Shark implements Swimable, Huntable{
    private String typeShark; // тип акулы
    private String location; // местоположение акулы

    public String getTypeShark() {
        return typeShark;
    }
    public void setTypeShark(String typeShark) {
        this.typeShark = typeShark;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public Shark(String typeShark){
        this.typeShark = typeShark;
    }

    @Override
    public void swim() {
        System.out.println("Акула умеет плавать!");
    }

    @Override
    public void hunt() {
        System.out.println("Я умею охотиться в поисках пищи!");
    }

    @Override
    public String toString() {
        return "Акула";
    }
}
