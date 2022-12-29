package calculate;

import calculate.interfaces.Actionable;
import calculate.interfaces.Notificable;
import calculate.interfaces.Resetable;

import java.util.Scanner;

public class Action implements Notificable, Actionable, Resetable {
    private double result = 0; // результат вычисления

    // геттер(ы) и сеттер(ы)
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }

    // реализация методов
    @Override
    public void action() {
        Scanner scan = new Scanner(System.in);
        notication("Введите первое число, знак операции, и второе число: ");
        this.result = scan.nextDouble(); // первое число
        char mathSign = scan.next().charAt(0); // знак операции
        double num = scan.nextDouble(); // второе число

        switch (mathSign) {
            case '+' -> { // если знак плюс
                this.result = this.result + num;
                notication("Результат операции: " + this.result + "\n");
                break;
            }

            case '-' -> { // если знак минус
                this.result = this.result - num;
                notication("Результат операции: " + this.result + "\n");
                break;
            }

            case '/' -> { // если знак деления

                if (num == 0) {
                    notication("Результат операции: Ошибка, делить на 0 нельзя" + "\n");
                }

                else {
                    this.result = this.result / num;
                    notication("Результат операции: " + this.result + "\n");
                }
                break;
            }

            case '*' -> { // если знак умножения
                this.result = this.result * num;
                notication("Результат операции: " + this.result + "\n");
                break;
            }
        }
    }

    @Override
    public void reset() { // метода сброса операции (вернуть на исходную позицию)
        this.result = 0;
        notication("Результат сброса: " + this.result);
    }

    @Override
    public String toString() {
        return "Последний результат: " + this.getResult();
    }
}
