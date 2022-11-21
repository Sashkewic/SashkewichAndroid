public class Main {
    public static void main(String[] args) {
        WeightFridge weightFridge = new WeightFridge(55); // вес холодильника
        Freeze freeze = new Freeze(); // вес холодильника
        ContainersForVeget forVeget = new ContainersForVeget(1); // кол-во контейнеров для овощей
        ContainersForFruits forFriuts = new ContainersForFruits(0); // кол-во контейнеров для фруктов
        MainShelves mainShelves = new MainShelves(3); // кол-во основных полок
        SideShelves sideShelves = new SideShelves(4); // кол-во боковых полок
        Temp temp = new Temp(-30); // Максимальная регулируемая температура внутры холодильника
        Price price = new Price(0); // Цена

        Fridge myHomeFridge = new Fridge("Samsung",
                weightFridge, freeze, forVeget, forFriuts, mainShelves, sideShelves, temp, price);

        price.setMoneyPrice(27000);

        System.out.println(myHomeFridge);
    }
}