package writeFromJavaToTxt;

public class Worker {
    private String fullName; // полное имя работника
    private int age; // возраст
    private String jobTitle; // должность

    // геттер(ы) и сеттер(ы)

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Worker(String fullName, int age, String jobTitle) {
        this.fullName = fullName;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Информация о работнике: " + "\n" +
                "Полное имя: " + this.getFullName() + "\n" +
                "Возраст: " + this.getAge() + "\n" +
                "Должность: " + this.getJobTitle() + "\n";
    }
}