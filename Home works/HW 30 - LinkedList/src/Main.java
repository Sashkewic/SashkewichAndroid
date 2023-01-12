import classes.Cat;
import classes.Dog;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> animals = new LinkedList<>();
        double objectAge = 0.5; // изначальный возраст кошек и собак

        for (int i = 0; i < 50; i++){
            animals.add(new Cat("Кошка", objectAge)); // добавляем кошку
            animals.add(new Dog("Собака", objectAge)); // добавляем собаку
            objectAge += 0.5;
        }

        System.out.println(animals);

        if (Cat.getIndex() % 5 == 0){
            animals.remove(Cat.getIndex() % 5 == 0);
        }

        System.out.println(animals);

    }
}