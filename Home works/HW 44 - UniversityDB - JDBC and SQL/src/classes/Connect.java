package classes;
import java.sql.*;
import java.util.ArrayList;

public class Connect {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "123";

    public Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully." + "\n");
        }

        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    // метод по поиску студента (по ФИО)
    public String searchStudent() {
        String SQL = """
                SELECT st.id, st.fullname, st.birthdate, g.group_code, f.name, u.name
                FROM student st
                JOIN groups g on g.id = st.group_id
                JOIN faculty f on f.id = g.faculty_id
                JOIN university u on u.id = f.university_id WHERE st.fullname = 'Алексеева Варвара Александровна'""";
        String student = "";

        try (Connection conn = connect(); Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL)){
            while (resultSet.next()){
                 student = "ФИО: " + resultSet.getString(2) + "\n"
                         + "Дата рождения: " + resultSet.getString(3) + "\n"
                         + "Группа: " + resultSet.getString(4) + "\n"
                         + "Факультет: " + resultSet.getString(5) + "\n"
                         + "Университет: " + resultSet.getString(6) + "\n" + "\n";
            }
        }

        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }

        return student;
    }

    // метод, посчитывающий среднее арифметическое всех оценок определенного студента
    public String getAvgGradeOfStudent() {
        String SQL = "SELECT st.id, st.fullname, avg(g.grade) FROM student st JOIN grade g on st.id = g.student_id WHERE st.fullname = 'Крюков Фёдор Александрович' group by st.id";
        String avgGrade = "";

        try (Connection conn = connect(); Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL)){
            while (resultSet.next()){
                avgGrade = "ФИО: " + resultSet.getString(2) + "\n" + "Средняя оценка: " +
                        resultSet.getString(3).substring(0, 4) + "\n";
            }
        }

        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }

        return avgGrade;
    }

    // метод, добавляющий студента в БД
    public void addStudent(String fullname, int group_id, String birthdate){
        String SQL = "INSERT INTO student (id, fullname, group_id, birthdate) values (?, ?, ?, ?)";
        String searchId = "SELECT count(*) FROM student";
        int id = 1;

        try (Connection conn = connect(); PreparedStatement statement = conn.prepareStatement(SQL)){

            try (Statement stmt = conn.createStatement();
                 ResultSet resultSet = stmt.executeQuery(searchId)){
                while (resultSet.next()) {
                    id += resultSet.getInt(1);
                }
            }

            catch (Exception e) {
                throw new RuntimeException(e);
            }

            statement.setInt(1, id);
            statement.setString(2, fullname);
            statement.setInt(3, group_id);
            statement.setDate(4, Date.valueOf(birthdate));
            statement.execute();
            System.out.printf("Студент %s был добавлен в базу данных по вашему запросу", fullname);
        }

        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    // метод, удаляющий студента из БД
    public void deleteStudent() {
        String SQL = "DELETE FROM student st WHERE st.fullname = 'Живайкин Александр Романович'";

        try (Connection conn = connect(); Statement statement = conn.createStatement()){
            statement.executeUpdate(SQL);
            System.out.println("Студент был удален из базы данных по вашему запросу");
        }

        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void addStudentsToList(ArrayList<Student> students){
        String SQL = "SELECT st.id, st.fullname, st.birthdate FROM student st";
        try (Connection conn = connect(); Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(SQL)){
            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getInt(1));
                student.setFullname(resultSet.getString(2));
                student.setBirthdate(resultSet.getString(3));
                students.add(student);
            }
        }

        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }



    public Connect(){}
}
