import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите название файла: ");

        replacingExtension(scan.nextLine());
        System.out.print("Введите название файла: ");

        replacingExtension(scan.nextLine());
        System.out.print("Введите название файла: ");
        replacingExtension(scan.nextLine());
    }

    public static void replacingExtension(String fileName){
        ArrayList <String> fullname = new ArrayList<>(List.of(fileName.split("\\.")));

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите новое расширение: ");
        String newExtension = scan.nextLine(); // вводим новое расширение файла

        if (fullname.size() == 1){ // если у файла есть только имя
            fileName = fullname.get(0) + "." + newExtension; // имя файла = старое имя + "." + новое расширение
            System.out.println("Результат: " + fileName + "\n");
        }

//        else {
//            fileName = "";
//            for (int i = 0; i < fullname.size() - 1; i++){
//                fileName += fullname.get(i) + ".";
//            }
//
//            fileName += newExtension;
//
//            System.out.println("Результат: " + fileName + "\n");
//        }

        /* то же самое, только используя StringBuilder */
        else {
            StringBuilder fileNameBuilder = new StringBuilder();
            for (int i = 0; i < fullname.size() - 1; i++){
                fileNameBuilder.append(fullname.get(i)).append(".");
            }
            fileName = fileNameBuilder + newExtension;

            System.out.println("Результат: " + fileName + "\n");
        }
    }
}
