package classes;

import java.util.Objects;

// 1. Создать класс «Кошка».
public class Cat {
    int id;
    String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Cat(int id, String name){
        this.id = id;
        this.name = name;
    }

    // 3. Переопределить equals
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;


        if (obj instanceof Cat) {
            return ((Cat) obj).name.equals(this.name) && ((Cat) obj).id == id;
        }

        Cat cat = (Cat) obj;
        return this.getId() == cat.getId() && this.getName().equals(cat.getName());
    }

    // 5. Переопределить hashCode
    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "," + " Имя: " + this.name;
    }
}
