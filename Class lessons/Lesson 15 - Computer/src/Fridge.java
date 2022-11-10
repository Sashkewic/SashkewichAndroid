public class Fridge {
    String name;
    WeightFridge weightFridge;
    Freeze freeze;
    Containers containersForVeget;
    Containers countContainersForVeget;
    Containers containersForFruits;
    Containers countContainersForFruits;

    Shelves countMainShelves; // количество основных полок холодильника
    Shelves countSideShelves; // количество боковых (дверных) полок холодильника

    Thermometer minThermometer;
    Thermometer maxThermometer;

    Price moneyPrice;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Fridge(String name, WeightFridge weightFridge, Freeze freeze, Containers countContainersForVeget, Containers countContainersForFruits,  Shelves countMainShelves, Shelves countSideShelves, Thermometer minThermometer, Thermometer maxThermometer, Price price) {
        this.name = name;
        this.weightFridge = weightFridge;
        this.freeze = freeze;
        this.countMainShelves = countMainShelves;
        this.countSideShelves = countSideShelves;
        this.countContainersForVeget = countContainersForVeget;
        this.countContainersForFruits = countContainersForFruits;
        this.minThermometer = minThermometer;
        this.maxThermometer = maxThermometer;
        this.moneyPrice = price;
    }

    @Override
    public String toString() {
        return "Конфигурация холодильника под маркой " + this.getName() +
                "\n" + "1) Вес холодильника: " + this.weightFridge +
                "\n" + "2) Наличие морозильника: " + this.freeze +
                "\n" + "3) Количество контейнеров для овощей: " + this.countContainersForVeget +
                "\n" + "4) Количество контейнеров для фруктов: " + this.countContainersForFruits +
                "\n" + "5) Количество полок в холодильнике: " + this.countMainShelves +
                "\n" + "6) Количество боковых полок в холодильнике: " + this.countSideShelves +
                "\n" + "7) Минимальная регулируемая температура внутры камеры: " + this.minThermometer +
                "\n" + "8) Максимальная регулируемая температура внутры камеры: " + this.maxThermometer +
                "\n" + "9) Цена: " + this.moneyPrice;
    }
}
