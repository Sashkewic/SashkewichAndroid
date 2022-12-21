package animal;

public interface Swimable {
    default void swim() {
        System.out.println("Животное умеет плавать!");
    }
}
