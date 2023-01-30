import classes.Connect;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connect connect = new Connect(); // инициализируем обьект класса Connect
        connect.connect(); // с помощью метода класса открываем соединение с нашей БД
        System.out.printf("Количество студентов в имени которых содержится буква «а»: %d.\n", connect.getStudentsCountWithA());
        System.out.printf("В группе: %d студентов \n", connect.getStudentsCount());
        connect.getInfoOfGroups();
    }
}