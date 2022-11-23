package liblary;

public class ApiUser {
    public static void main(String[] args) {
        Book newBook = new Book("Джоан К. Роулинг", "Гарри Поттер и философский камень", 487,
                "Оксана Бочарова", "17.212.5 Г45", true);
        newBook.setGiftedBy("Наталья Бочарова");
        System.out.println(newBook);
    }
}
