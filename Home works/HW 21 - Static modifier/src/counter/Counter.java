package counter;

public class Counter {
    // поля
    private static int numOfCalls;

    // геттеры и сеттеры
    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public static void setNumOfCalls(int numOfCalls) {
        Counter.numOfCalls = numOfCalls;
    }

    // методы
    public static void increment() {
        Counter.numOfCalls += 1;
    }

    public int factorial() {
        int factorialResult = 1;

        for (int i = 1; i <= Counter.numOfCalls; i++) {
            factorialResult = factorialResult * i;
        }
        return factorialResult;
    }

    // переопределения

    @Override
    public String toString() {
        return "Факториал числа " + Counter.numOfCalls + ": " + factorial();
    }
}
