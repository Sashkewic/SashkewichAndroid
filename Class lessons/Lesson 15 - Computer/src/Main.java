public class Main {
    public static void main(String[] args) {
        WeightFridge weightFridge = new WeightFridge(); // вес холодильника
        Freeze freeze = new Freeze(); // вес холодильника
        Containers forVeget = new Containers(); // кол-во контейнеров для овощей
        Containers forFriuts = new Containers(); // кол-во контейнеров для фруктов
        Shelves mainShelves = new Shelves(); // кол-во основных полок
        Shelves sideShelves = new Shelves(); // кол-во боковых полок
        Thermometer minT = new Thermometer(); // Минимальная регулируемая температура внутры холодильника
        Thermometer maxT = new Thermometer(); // Максимальная регулируемая температура внутры холодильника
        Price price = new Price(); // Максимальная регулируемая температура внутры холодильника

        Fridge myHomeFridge = new Fridge("Samsung",
                weightFridge, freeze, forVeget, forFriuts, mainShelves, sideShelves, minT, maxT, price);
        System.out.println(myHomeFridge);
    }
}