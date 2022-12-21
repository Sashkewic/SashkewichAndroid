package dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 17.5, 5);
        Dog dog2 = new Dog("Mister", 25.1, 7);
        Dog dog3 = new Dog("Dic", 7.5, 1);

        System.out.println("Количество собак: " + Dog.getCountofDogs());
    }
}
