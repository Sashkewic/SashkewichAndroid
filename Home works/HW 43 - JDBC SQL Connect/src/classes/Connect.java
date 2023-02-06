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

    // метод внесения данных в таблицу countries
    public void addCountry() throws SQLException {
        try (Connection conn = connect(); Statement statement = conn.createStatement()) {
            statement.execute("INSERT INTO countries (id, name) values (1, 'Kyrgyzstan'), (2, 'Russia'), (3, 'Australia'), (4, 'Kazakhstan'), (5, 'USA')");
        }

        catch (SQLException ex) {
            notification(ex.getMessage());
        }
    }

    // метод внесения данных в таблицу cities
    public void addCities() throws SQLException {
        try (Connection conn = connect(); Statement statement = conn.createStatement()) {
            statement.execute("INSERT INTO cities (id, name, country) values (" +
                    "1, 'Bishkek', 1), (2, 'Moscow', 2), (3, 'Sydney', 3), (4, 'Almata', 4), (5, 'Boston', 5)");
        }

        catch (SQLException ex) {
            notification(ex.getMessage());
        }
    }
    // метод внесения данных в таблицу mayors
    public void addMayors() throws SQLException {
        try (Connection conn = connect(); Statement statement = conn.createStatement()) {
            statement.execute("INSERT INTO mayors (id, fullname, city) values (" +
                    "1, 'Эмилбек Абдыкадыров', 1), (2, 'Сергей Собянин', 2), (3, 'Мишель Ву', 3), (4, 'Ерболат Досаев', 4), (5, 'Кловер Мур', 5)");
        } catch (SQLException ex) {
            notification(ex.getMessage());
        }
    }

    // метод получения данных из таблицы cities + countries
    public String getCitiesAndCountries() throws SQLException {
        String SQL = "SELECT c.name, c2.name FROM cities c JOIN countries c2 ON c.id = c2.id";

        String data = "";
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                data = rs.getString("name") + " " + rs.getString(2);
            }

        } catch (SQLException ex) {
            notification(ex.getMessage());
        }

        return data;
    }

    public String getCitiesLess5Chars() throws SQLException {
        String SQL = "SELECT name FROM cities WHERE char_length(name) > 5";

        StringBuilder data = new StringBuilder();
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                data.append(rs.getString("name")).append(", ");
            }

        } catch (SQLException ex) {
            notification(ex.getMessage());
        }

        return data.toString();
    }

    public Connect(){}
}
