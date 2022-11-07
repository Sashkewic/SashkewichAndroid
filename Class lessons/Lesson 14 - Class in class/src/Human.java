public class Human {
    int age;
    String name;
    double weight;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        if (this.age > 0) return true;
        else return false;
    }
}

class Person extends Human {
    String countryFrom;
    String sex;
    String height;

    public String getCountryFrom() {
        return countryFrom;
    }

    public void setCountryFrom(String countryFrom) {
        this.countryFrom = countryFrom;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + "\n" + "Возраст: " + this.age + "\n" + "Вес: " + this.weight + "\n" + "Страна рождения: "  + this.countryFrom + "\n" + "Пол: " + this.sex + "\n" + "Рост: " + this.height + "\n";
    }
}
