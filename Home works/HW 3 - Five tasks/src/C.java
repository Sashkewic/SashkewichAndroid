import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        // Задача С - Ввести последовательно возраст Антона, Бориса и Виктора. Определить кто из них старше.

        Scanner scan = new Scanner(System.in);
        int ageAnton, ageBoris, ageVictor;

        System.out.print("Возраст Антона: ");
        ageAnton = scan.nextInt();
        System.out.print("Возраст Бориса: ");
        ageBoris = scan.nextInt();
        System.out.print("Возраст Виктора: ");
        ageVictor = scan.nextInt();

        if (ageAnton > ageBoris && ageAnton > ageVictor) {
            System.out.print("Антон старше всех");
        }

        else if (ageBoris > ageAnton && ageBoris > ageVictor) {
            System.out.print("Борис старше всех");
        }

        else if (ageVictor > ageAnton && ageVictor > ageBoris) {
            System.out.print("Виктор старше всех");
        }

        else if (ageAnton == ageBoris && ageAnton > ageVictor) {
            System.out.print("Антон и Борис старше всех");
        }

        else if (ageBoris == ageVictor && ageBoris > ageAnton) {
            System.out.print("Борис и Виктор старше всех");
        }

        else if (ageAnton > ageBoris) {
            System.out.print("Антон и Виктор старше всех");
        }

        else {
            System.out.print("Все трое ровесники");
        }
    }
}
