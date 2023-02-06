import classes.Connect;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connect connect = new Connect();
//        connect.addCountry();
//        connect.addCities();
//        connect.addMayors();
//        connect.getCitiesAndCountries();
        ArrayList<String> dataList = new ArrayList<>(); // недоделано задание "внести города и страны в ArrayList"
        dataList.add(connect.getCitiesAndCountries());
        System.out.println(dataList);

        System.out.printf("Города, в названий которых больше 5 букв: %s \n", connect.getCitiesLess5Chars());
    }
}