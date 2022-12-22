import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileWriter fileWriter = new FileWriter("something.txt"); // Чтобы создать объект FileWriter, можно использовать один из следующих конструкторов
//        String nums = ""; // здесь будет строка с числами
//        String alphabet = ""; // здесь будет строка с англ. алфавитом
//
//        for (char i = '\u0041'; i <= '\u005A'; i++){ // перебираем циклом алфавит от A до Z (вкл)
//            alphabet += "" + i; // в строку добавляется буква
//        }
//
//        for (int j = 0; j <= 9; j++){ // перебираем циклом цифры от 0 до 9 (вкл)
//            nums += "" + j; // в строку добавляется цифра
//        }
//        fileWriter.write(alphabet + "\n"); // метод write записывает в файл строку с алфавитом
//        fileWriter.write(nums); // метод write записывает в файл строку с цифрами
//        fileWriter.close(); // закрываем процесс работы в файлом
//
//
//        FileReader fileReader = new FileReader("something.txt");
//        Scanner sc = new Scanner(fileReader);
//
//        int i = 1;
//        while (sc.hasNextLine()) {
//            System.out.println(i + ": " + sc.nextLine());
//            i++;
//        }
//
//        fileReader.close();
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }

        catch (Exception ex){
            System.out.println(ex);
        }
    }
}