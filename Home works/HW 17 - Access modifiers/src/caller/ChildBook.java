package caller;

import liblary.Book;

public class ChildBook extends Book {
    public ChildBook(String author, String title, int pagesCount, String giftedBy, String pressmark, boolean needsRepair) {
        super(author, title, pagesCount, giftedBy, pressmark, needsRepair);
    }

    @Override
    public String toString(){
        return "Информация о книге:" + "\n" +
                "Автор: " + this.getAuthor() + "\n" +
                "Название книги: " + this.getTitle() + "\n" +
                "Количество страниц: " + this.getPagesCount() + "\n" +
                "Подарен кем: " + this.getGiftedBy() + "\n" +
                "Шифр: " + this.getPressmark() + "\n" +
                "Нуждается ли в реставрации: " + this.isNeedsRepair() + "\n";
    }

    public static void main(String[] args) {
        ChildBook childBook = new ChildBook("Рид Томас Майн", "Всадник без головы",
                608, "Юрий Пономаренко", "22.788.51 Б63", true);
        childBook.setNeedsRepair(false);
        System.out.println(childBook);
    }
}
