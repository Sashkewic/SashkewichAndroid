package animal;

public interface Layable {
    default void layEggs(int eggs){
        System.out.printf("Животное вынесло %d яиц" + "\n", eggs);
    }
}
