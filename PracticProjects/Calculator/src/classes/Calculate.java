package classes;

import interfaces.Actionable;
import interfaces.Notificationable;
import interfaces.Resetable;

import java.util.Scanner;

public class Calculate implements Actionable, Notificationable, Resetable {
    protected double result = 0;
    Scanner scan = new Scanner(System.in);
    protected double num;
    public Addition addition;
    public Subtraction subtraction;
    public Multiplication multiplication;
    public Division division;

    // геттер(ы) и сеттер(ы)
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }

    public double getNum() {
        return num;
    }
    public void setNum(double num) {
        this.num = num;
    }

    // метод(ы) и реализации
    @Override
    public void notification(String message) {
        System.out.print(message);
    }

    @Override
    public void operation() { // метод, проводящий операцию c числами
        Scanner scan = new Scanner(System.in);
        notification("Введите число, знак, и еще одно число: ");
        this.result = scan.nextDouble(); // первое число
        char mathSign = scan.next().charAt(0); // знак операции
        this.num = scan.nextDouble(); // число, которое будет взаимодействовать с первым числом и оператором

        switch (mathSign) {
            case '+' -> { // если знак плюс
                addition.addition(); // сработает метод сложения чисел
                break;
            }

            case '-' -> { // если знак минус
                subtraction.subtract(); // сработает метод вычитания чисел
                break;
            }

            case '*' -> { // если знак умножения
                multiplication.multiply(); // сработает метод умножения чисел
                break;
            }

            case '/' -> { // если знак деления
                division.divide(); // сработает метод деления чисел
                break;
            }
        }
    }

    @Override
    public void reset() {
        this.result = 0;
        notification("Результат сброса: " + this.result);
    }

    // конструктор(ы)
    public Calculate(){}

    @Override
    public String toString() {
        return "Последний результат: " + this.getResult();
    }
}
