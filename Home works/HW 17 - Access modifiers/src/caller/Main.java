package caller;

import liblary.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Алан А. Милн", "Винни-Пух и все-все-все", 384,
                "Наталья Бочарова", "65.291.2 Б81", false);
        book.setAuthor("Борис Заходер");
        book.setPagesCount(424);

        // изменить человека, который подарил книгу здесь нельзя, так как сеттер доступен лишь в пределах пакета liblary и наследникам класса Book
        System.out.println(book);

        ChildBook newChildBook = new ChildBook("Линдгрен Астрид", "Малыш и Карлсон, который живёт на крыше",
                176, "Ульяна Тен", "14.128.51 Б91", false);
        newChildBook.setNeedsRepair(false);
        System.out.println(newChildBook);
    }
}