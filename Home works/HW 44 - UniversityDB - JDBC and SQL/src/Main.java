import classes.Connect;
import classes.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connect conn = new Connect();
        // 1. поиск студента
//        System.out.printf("Информация о студенте: \n" + "%s", conn.searchStudent());

        // 2. получение средней оценки студента
//        System.out.printf("Информация о студенте: \n" + "%s", conn.getAvgGradeOfStudent());

        // 3. добавление студента
//        conn.addStudent("Цой Юрий Александрович", 1, "2005-09-08");

        // 4. удаление студента
//        conn.deleteStudent();

        // 5. Получение списка студентов
        ArrayList<Student> students = new ArrayList<>();
        conn.addStudentsToList(students);

        for (Student student: students) {
            System.out.printf("ID: %d, ФИО: %s, Дата рождения: %s \n", student.getId(), student.getFullname(), student.getBirthdate());
        }
    }
}