package account;

import java.util.Objects;
import java.util.Scanner;

public class Account {
    private String email; // почта пользователя
    private String password; // пароль пользователя
    private String name; // имя пользователя
    private Scanner sc;

    // геттер(ы) и сеттер(ы)

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Scanner getSc() {
        return sc;
    }
    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    // метод(ы)
    public void notification(String message){ // уведомления
        System.out.println(message);
    }

    public void enterToAccount(String email, String password){ // вход в аккаунт
        if (!Objects.equals(this.email, email) || !Objects.equals(this.password, password)) {
            notification("Вы ввели неправильный логин и/или пароль!");
        }

        else {
            notification("Вы успешно вошли в аккаунт");
        }
    }


    // конструктор(ы)
    public Account(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пользователь:" + "\n" +
                "Почта: " + this.getEmail() + "\n" +
                "Пароль: " + this.getPassword() + "\n" +
                "Имя пользователя: " + this.getName() + "\n" + "\n";
    }
}