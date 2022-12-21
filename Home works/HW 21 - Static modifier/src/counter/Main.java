package counter;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter.increment();
        counter1.factorial();
        System.out.println(counter1);
        System.out.println(Counter.getNumOfCalls());


        Counter counter2 = new Counter();
        Counter.increment();
        Counter.increment();
        Counter.increment();
        counter2.factorial();
        System.out.println(counter2);
        System.out.println(Counter.getNumOfCalls());
    }
}