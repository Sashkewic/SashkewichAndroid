package classes;
import java.sql.*;
public class Connect {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "123";

    public Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public String notification(String message){
        System.out.println(message);
        return message;
    }

    public int getStudentsCountWithA() throws SQLException {
        String SQL = "SELECT count(fullname) FROM students s WHERE fullname like '%а%'";
        int count = 0;

        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            notification(ex.getMessage());
        }
        connect().close();

        return count;
    }

    public int getStudentsCount() throws SQLException {
        String SQL = "SELECT count(fullname) FROM students";
        int countStudents = 0;

        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            countStudents = rs.getInt(1);
        } catch (SQLException ex) {
            notification(ex.getMessage());
        }
        connect().close();

        return countStudents;
    }

    public String getInfoOfGroups() throws SQLException {
        String SQL = "SELECT id, name_group FROM groups";

        String data = "";
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                data = rs.getString("id") +
                        " " + rs.getString("name_group");

                notification(data);
            }

        } catch (SQLException ex) {
            notification(ex.getMessage());
        }

        connect().close();
        return data;
    }
}
