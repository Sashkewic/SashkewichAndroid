package account;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Account alexZhivaykin = new Account("Sashkewicha@gmail.com", "smd16s", "Александр Живайкин");

        Account [] users = new Account[100];
        users[0] = alexZhivaykin;

        FileWriter fileWriter = new FileWriter("C:/Users/User/Desktop/SashkewichAndroid/Home works/HW 26 - Write and reading files/src/account/Users.txt");
        fileWriter.write(String.valueOf(alexZhivaykin));
        fileWriter.close();

        alexZhivaykin.enterToAccount("Sashkewich@gmail.com", "smd16s");
    }
}