// Создайте класс Студент - c полями ФИО, возраст, оценка

public class Student {
    String fullname;
    int age;
    double mark;

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student(String fullname, int age, double mark) {
        this.fullname = fullname;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Информация о студенте: " + "\n" +
                "ФИО: " + this.getFullname() + "\n" +
                "Возраст: " + this.getAge() + "\n" +
                "Оценка: " + this.getMark() + "\n";
    }
}
