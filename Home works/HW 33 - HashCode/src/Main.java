import classes.Cat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 2. Создать двух кошек. Считать их hashcode.
        Cat cat1 = new Cat(1,"Кошка 1");
        Cat cat2 = new Cat(2,"Кошка 2");
        System.out.printf("Хэшкод первой кошки: %h \n", cat1.hashCode());
        System.out.printf("Хэшкод второй кошки: %h \n" + "\n", cat2.hashCode());

        // 4. Сравнить кошек в ArrayList.
        ArrayList <Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        System.out.printf("Первая кошка: %b, вторая кошка: %b \n" + "\n", cats.equals(cat1), cats.equals(cat2));

        // 6. Добавить 4 кошек в HashSet
        Set<Cat> hashCats = new HashSet<Cat>();
        hashCats.add(new Cat(3, "Кошка 3"));
        hashCats.add(new Cat(4, "Кошка 4"));
        hashCats.add(new Cat(5, "Кошка 5"));
        hashCats.add(new Cat(6, "Кошка 6"));

        for (Cat cat: hashCats) {
            System.out.println(cat);
        }

        // 7. Посчитать длину HashSet
        System.out.println("Длина hashSet: " + hashCats.size() + "\n");

        // 8. Добавить уже имеющихся кошек
        hashCats.add(cat1);
        hashCats.add(cat2);
        // 9. Посчитать длину HashSet
        System.out.println("Длина hashSet после добавления первых двух кошек: " + hashCats.size() + "\n");
        // 10. Нужно хранить в Set только уникальных кошек
        hashCats.add(new Cat(3, "Кошка 3"));
        hashCats.add(new Cat(4, "Кошка 4")); // пробуем добавить в Set две кошки, которые уже лежат в Set
        System.out.println("Длина hashSet после добавления двух уже существующих кошек в Set: " + hashCats.size() + "\n");
    }
}