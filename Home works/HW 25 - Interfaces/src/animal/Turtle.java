package animal;

public class Turtle implements TurtleFunctionable, Swimable, Layable{
    private double weight; // вес черепахи
    private String location; // местоположение черепахи
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public Turtle(double weight, String location){
        this.weight = weight;
        this.location = location;
    }

    @Override
    public void layEggs(int eggs) {
        System.out.printf("Черепаха вынесла %d яиц" + "\n", eggs);
    }

    @Override
    public void wearShell() {
        System.out.println("Я ношу с собой панцирь!");
    }

    @Override
    public void test() {
        System.out.println("Черепаха может все - и плавать, и носить панцирь!");
    }

    @Override
    public String toString() {
        return "Черепаха";
    }
}
