package classes;

public class Student {
    private int id;
    private String fullname;
    private String birthdate;

    // геттер(ы) и сеттер(ы)

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    // Конструктор
    public Student(){}
}
