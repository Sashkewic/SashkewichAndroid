public class Fridge {
    String name;
    WeightFridge weightFridge;
    Freeze freeze;
    ContainersForVeget countContainersForVeget;
    ContainersForFruits countContainersForFruits;

    MainShelves countMainShelves; // количество основных полок холодильника
    SideShelves countSideShelves; // количество боковых (дверных) полок холодильника

    MinT minThermometer;
    MaxT maxThermometer;

    Price moneyPrice;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Fridge(String name, WeightFridge weightFridge, Freeze freeze, ContainersForVeget countContainersForVeget,
                  ContainersForFruits countContainersForFruits, MainShelves countMainShelves, SideShelves countSideShelves, MinT minT, MaxT maxT, Price price) {
        this.name = name;
        this.weightFridge = weightFridge;
        this.freeze = freeze;
        this.countMainShelves = countMainShelves;
        this.countSideShelves = countSideShelves;
        this.countContainersForVeget = countContainersForVeget;
        this.countContainersForFruits = countContainersForFruits;
        this.minThermometer = minT;
        this.maxThermometer = maxT;
        this.moneyPrice = price;
    }

    @Override
    public String toString() {
        return "Конфигурация холодильника " + this.getName() +
                "\n" + "1) Вес холодильника: " + this.weightFridge.getWeight() + " кг" +
                "\n" + "2) Наличие морозильника: " + this.freeze.isFreeze() +
                "\n" + "3) Количество контейнеров для овощей: " + this.countContainersForVeget.getCountContainersForVeget() + " шт" +
                "\n" + "4) Количество контейнеров для фруктов: " + this.countContainersForFruits.getCountContainersForFruits() + " шт" +
                "\n" + "5) Количество полок в холодильнике: " + this.countMainShelves.getCountMainShelves() + " шт" +
                "\n" + "6) Количество боковых полок в холодильнике: " + this.countSideShelves.getCountSideShelves() + " шт" +
                "\n" + "7) Минимальная регулируемая температура внутры камеры:" + " от " + this.minThermometer.getMinT() + "*C" + " до " + this.maxThermometer.getMaxT() + "*C" +
                "\n" + "9) Цена: " + this.moneyPrice.getMoneyPrice() + " cом";
    }
}
