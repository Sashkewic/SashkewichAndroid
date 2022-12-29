package calculate.interfaces;

public interface Notificable {
    default void notication(String message) {
        System.out.print(message);
    }
}
