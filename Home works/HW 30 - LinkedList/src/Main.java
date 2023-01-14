import classes.Animal;
import classes.Cat;
import classes.Dog;
import classes.Mouse;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        int countCats = 0; // количество кошек
        int countDogs = 0; // количество собак

        int catsAge = 0; // сумма возрастов всех кошек
        int dogsAge = 0; // сумма возрастов всех собак
        int miceAge = 0; // сумма возрастов всех мышей


        // 1. Создать по 50 кошек и собак, с возрастом идущим на увеличение, 2. Сохранить всех кошек и собак в LinkedList
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){ // если счетчик четный
                animals.add(i, new Cat("Кошка", Cat.getCatsAge())); // добавляем на четное место (НЕ ИНДЕКС) списка созданную "Кошку"
            }

            else { // если счетчик нечетный
                animals.add(i, new Dog("Собака", Dog.getDogsAge())); // добавляем на нечетное место (НЕ ИНДЕКС) списка созданную "Кошку"
            }
        }

        System.out.println(animals); // смотрим список всех кошек и собак
        System.out.println("Количество кошек и собак в списке: " + animals.size() + "\n"); // размер списка


        // =================================
        for (int i = 0; i < animals.size(); i++){
            // 3. Удалить из списка каждую 5 "Кошку"
            if (animals.get(i) instanceof Cat){ // если находим "Кошку" в списке
                countCats++; // количество кошек + 1

                if (countCats / 5 == 1){ // если попадается нам каждая 5ая "Кошка"
                    countCats = 0; // счетчик кошек обнуляется
                    animals.remove(i); // а каждую 5ую "Кошку" удаляем
                }
            }

            // 4. Вставить после каждой 3 собаки – одну мышку.
            else if (animals.get(i) instanceof Dog){ // если находим "Собаку" в списке
                countDogs++; // количество собак + 1

                if (countDogs / 3 == 1){ // если попадается нам каждая 3ая "Собака"
                    countDogs = 0; // счетчик собак обнуляется
                    animals.add(i + 1, new Mouse("Мышь", Mouse.getMouseAge())); // после 3ей "Собаки" следующим элементом будет созданная "Мышь"
                    i++;
                }
            }
        }
        System.out.println(animals); // смотрим список кошек, собак и добавленных мышей
        System.out.println("Количество кошек, собак и мышей в списке: " + animals.size() + "\n"); // размер списка


        // =============================================
        // 5. Найти оказавшихся рядом кошек и мышек, переместить их в новый LinkedList.
        LinkedList<Animal> catsMice = new LinkedList<>(); // новый список всех кошек и мышей, соседствующих в списке animals
        for (int i = 0; i < animals.size() - 1; i++) { // пробегаем по спис
            if ((animals.get(i) instanceof Cat && animals.get(i + 1) instanceof Mouse) ||
                    (animals.get(i + 1) instanceof Cat && animals.get(i) instanceof Mouse)) {
                // если в массиве животных текущий элемент "Кошка", а следующий "Мышь" (и наоборот)
                catsMice.add(animals.get(i)); // добавляем в новый список "Мышь"
                animals.remove(i); // "Мышь" из старого списка удаляем
                catsMice.add(animals.get(i)); // добавляем в новый список "Кошку" (так как после удаления "Мыши" произошло изменение ссылки у следующего элемента)
                animals.remove(i); // "Кошку" из старого списка удаляем
            }
        }

        System.out.println(catsMice); // смотрим список всех кошек и мышей, соседствующих в списке animals
        System.out.println("Количество соседей кошек и мышей: " + catsMice.size() + "\n"); // смотрим список всех кошек и мышей, соседствующих в списке animals


        // =============================================
        // 6.Скопировать весь список из пункта 4 в ArrayList.
        animals.toArray();

        // =============================================
        // 7. Получить сумму возрастов отдельно по мышкам, кошкам и собакам.
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) // если текущий элемент списка "Кошка"
                catsAge += animals.get(i).getAge(); // прибавляем возраст "Кошки" к сумме всех возрастов "Кошек"
            else if (animals.get(i) instanceof Dog) // если текущий элемент списка "Собака"
                dogsAge += animals.get(i).getAge(); // прибавляем возраст "Собаки" к сумме всех возрастов "Собак"
            else if (animals.get(i) instanceof Mouse) // если текущий элемент списка "Мышь"
                miceAge += animals.get(i).getAge(); // прибавляем возраст "Мыши" к сумме всех возрастов "Мышей"
        }

        System.out.println("Сумма возрастов кошек: " + catsAge + "\n" +
                "Сумма возрастов собак: " + dogsAge + "\n" +
                "Сумма возрастов мышей: " + miceAge + "\n");
    }
}