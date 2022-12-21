package animal;

public class Main {
    public static void main(String[] args) {
        Tiger bengalTiger = new Tiger(120, 6, "Рыжий с черными полосами", "Р-р-р-р-р", 10, 60, 12, "Бангладеш");
        Cow milka = new Cow(200, 5, "Белый с черными пятнами", "Му-уууу", "Милка", "Евгений");
        bengalTiger.voice();
        bengalTiger.hi();
        bengalTiger.eat();
        bengalTiger.sleep();
        System.out.println(bengalTiger);

        milka.voice();
        milka.eat();
        milka.sleep();
        System.out.println(milka);
    }
}