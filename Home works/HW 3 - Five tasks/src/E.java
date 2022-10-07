import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        // Задача E - Напишите программу, которая получает номер месяца и выводит соответствующее ему месяц или сообщение об ошибке
        Scanner scan = new Scanner(System.in);
        int month;
        System.out.print("Введите номер месяца: ");
        month = scan.nextInt();

        switch (month) {
            case 1: System.out.printf("%d месяц - Январь", month);
                break;
            case 2: System.out.printf("%d месяц - Февраль", month);
                break;
            case 3: System.out.printf("%d месяц - Март", month);
                break;
            case 4: System.out.printf("%d месяц - Апрель", month);
                break;
            case 5: System.out.printf("%d месяц - Май", month);
                break;
            case 6: System.out.printf("%d месяц - Июнь", month);
                break;
            case 7: System.out.printf("%d месяц - Июль", month);
                break;
            case 8: System.out.printf("%d месяц - Август", month);
                break;
            case 9: System.out.printf("%d месяц - Сентябрь", month);
                break;
            case 10: System.out.printf("%d месяц - Октябрь", month);
                break;
            case 11: System.out.printf("%d месяц - Ноябрь", month);
                break;
            case 12: System.out.printf("%d месяц - Декабрь", month);
                break;
            default: System.out.printf("%d месяц - Неверный номер месяца", month);
        }
    }
}
