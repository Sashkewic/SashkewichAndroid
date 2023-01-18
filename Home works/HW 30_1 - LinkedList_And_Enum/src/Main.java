import classes.Computer;
import classes.Device;
import classes.Notebook;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Device> devices = new LinkedList<>();
        ArrayList<String> models = new ArrayList<>();
        models.add("DELL");
        models.add("ASUS");
        models.add("SAMSUNG");

        int randomElement = (int) Math.floor(Math.random() * models.size());
        System.out.println(models.get(randomElement));

        // 5. Создать по 50 ноутбуков и компов. Цены и модели могут дублироваться (повторяться).
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){ // если счетчик четный
                devices.add(i, new Computer(models.get(randomElement), Computer.getPriceOfComputer(), 26.5));
                // добавляем на четное место (НЕ ИНДЕКС) списка созданный "Компьютер"
            }

            else { // если счетчик нечетный
                devices.add(i, new Notebook(models.get(randomElement), Notebook.getPriceOfNotebook()));
                // добавляем на нечетное место (НЕ ИНДЕКС) списка созданный "Ноутбук"
            }
        }

        System.out.println("Список девайсов: " + devices + "\n");
    }

}