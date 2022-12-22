package animal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Swimable turtle1 = new Turtle(20, "Эквадор");
        Swimable turtle2 = new Turtle(15, "Индия");
        Swimable turtle3 = new Turtle(16, "Канада");
        Swimable turtle4 = new Turtle(14, "Мадагаскар");
        Swimable turtle5 = new Turtle(13, "Австралия");

        Huntable shark1 = new Shark("Белая");
        Huntable shark2 = new Shark("Синяя");
        Huntable shark3 = new Shark("Китовая");
        Huntable shark4 = new Shark("Китовая");
        Huntable shark5 = new Shark("Белая");

        Eatable duck1 = new Duck(1);
        Eatable duck2 = new Duck(1);
        Eatable duck3 = new Duck(2);
        Eatable duck4 = new Duck(3);
        Eatable duck5 = new Duck(4);

        Object[] allAnimal = {turtle1, turtle2, turtle3, turtle4, turtle5,
                shark1, shark2, shark3, shark4, shark5,
                duck1, duck2, duck3, duck4, duck5}; // Здесь находится массив из всех собранных животных
        System.out.println("Список животных, которые находятся у нас: " + Arrays.toString(allAnimal));


        Layable[] turtles = new Layable[5]; // создаем массив на 5 черепах
        Huntable[] sharks = new Huntable[5]; // создаем массив на 5 акул
        Eatable[] ducks = new Eatable[5]; // создаем массив на 5 уток

        int indexJ = 0; // индекс для заполнения массива с акулами
        int indexK = 0; // индекс для заполнения массива с утками


        for (int i = 0; i < allAnimal.length; i++) {
            if (allAnimal[i] instanceof Layable) {
                // если имеет тип ссылок Layable (то есть откладывать яйца).
                turtles[i] = (Turtle) allAnimal[i]; // черепаха переселяется в аквариум
                turtles[i].layEggs(5); // черепаха нас оповещает, что оно вынесло столько-то яиц
            }
        }

        for (int j = 5; j < allAnimal.length - 5; j++) {
            if (allAnimal[j] instanceof Huntable) {
                // если имеет тип ссылки Huntable (то есть охотники).
                sharks[indexJ] = (Shark) allAnimal[j]; // акула переселяется в аквариум
                sharks[indexJ].hunt(); // акула нас оповещает, что оно умеет охотиться
                indexJ++;
            }
        }

        for (int k = 10; k < allAnimal.length; k++) {
            if (allAnimal[k] instanceof Eatable) {
                // если имеет тип ссылок Eatable (то есть едят).
                ducks[indexK] = (Duck) allAnimal[k]; // утка переселяется в аквариум
                ducks[indexK].eat(); // утка нас оповещает, что оно умеет есть
                indexK++;
            }
        }


        System.out.println("Массив 1: " + Arrays.toString(turtles));
        System.out.println("Массив 2: " + Arrays.toString(sharks));
        System.out.println("Массив 3: " + Arrays.toString(ducks));
    }
}