package liblary;

public class Book {
    private String author; // автор книги
    private String title; // название книги
    private int pagesCount; // количество страниц в книге
    private String giftedBy; // кем подарена книга
    private String pressmark; // шифр книги
    private boolean needsRepair; // нуждается ли книга в реставрации

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesCount() {
        return pagesCount;
    }
    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    protected String getGiftedBy() {
        return giftedBy;
    }
    protected void setGiftedBy(String giftedBy) {
        this.giftedBy = giftedBy;
    }

    public String getPressmark() {
        return pressmark;
    }
    public void setPressmark(String pressmark) {
        this.pressmark = pressmark;
    }

    public boolean isNeedsRepair() {
        return needsRepair;
    }
    public void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }

    public Book(String author, String title, int pagesCount, String giftedBy, String pressmark, boolean needsRepair){
        this.author = author;
        this.title = title;
        this.pagesCount = pagesCount;
        this.giftedBy = giftedBy;
        this.pressmark = pressmark;
        this.needsRepair = needsRepair;
    }

    @Override
    public String toString(){
        return "Информация о книге:" + "\n" +
                "Автор: " + this.author + "\n" +
                "Название книги: " + this.title + "\n" +
                "Количество страниц: " + this.pagesCount + "\n" +
                "Подарен кем: " + this.giftedBy + "\n" +
                "Шифр: " + this.pressmark + "\n" +
                "Нуждается ли в реставрации: " + this.needsRepair + "\n";
    }
}
