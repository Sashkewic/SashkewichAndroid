public class Thermometer {
    int minThermometer; // минимальная регулируемая температура внутри холодильника
    int maxThermometer; // максимальная регулируемая температура внутри холодильника

    public int getMinThermometer() {
        return minThermometer;
    }
    public void setMinThermometer(int thermometer) {
        this.minThermometer = thermometer;
    }

    public int getMaxThermometer() {
        return maxThermometer;
    }
    public void setMaxThermometer(int maxThermometer) {
        this.maxThermometer = maxThermometer;
    }
}
