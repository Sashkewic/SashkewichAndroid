package SimCard;

import java.util.Objects;

public class SimCard {
    // поля
    private String name; // имя оператора
    private String user; // имя владельца сим-карты
    private String operatorCode; // код оператора (0553, 0700, и тд)
    private String numberTel; // 6-значный номер абонента (337397 - пример)
    private double balance; // количество денег на симке

    private double insideMin; // количество бесплатных минут внутри сети
    private double outsideMin; // количество бесплатных минут вне сети
    private int freeSms; // количество бесплатных смс
    private double quantityInet; // количество бесплатных ГБ интернета


    // геттеры и сеттеры полей
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public String getOperatorCode() {
        return operatorCode;
    }
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getNumberTel() {
        return numberTel;
    }
    public void setNumberTel(String numberTel) {
        this.numberTel = numberTel;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInsideMin() {
        return insideMin;
    }
    public void setInsideMin(double insideMin) {
        this.insideMin = insideMin;
    }

    public double getOutsideMin() {
        return outsideMin;
    }
    public void setOutsideMin(double outsideMin) {
        this.outsideMin = outsideMin;
    }

    public int getFreeSms() {
        return freeSms;
    }
    public void setFreeSms(int freeSms) {
        this.freeSms = freeSms;
    }

    public double getQuantityInet() {
        return quantityInet;
    }
    public void setQuantityInet(double quantityInet) {
        this.quantityInet = quantityInet;
    }

    // конструктор
    public SimCard(String name, String user, String operatorCode, String numberTel, double balance) {
        this.name = name;
        this.user = user;
        this.operatorCode = operatorCode;
        this.numberTel = numberTel;
        this.balance = balance;
    }

    // методы
    public void replenishBalance(double money) { // метод, пополняющий баланс
        this.balance = this.balance + money; // новый баланс = старый баланс + добавленное кол-во денег
    }

    public void buyPlan() { // метод приобретения тарифного плана
        if (Objects.equals(this.name, "Megacom") && this.balance >= 130.0) {
            // если у юзера сим-карта "Megacom" и достаточно денег на балансе для приобретения пакета,
            this.insideMin = 50; // он получает 50 минут внутри сети
            this.outsideMin = 10; // он получает 10 минут на другие сети
            this.freeSms = 20; // он получает 20 смс
            this.quantityInet = 15; // он получает 15 ГБ интернета
            this.balance = this.balance - 130.0; // с баланса списываются деньги
        }

        else if (Objects.equals(this.name, "O!") && this.balance >= 140.0) {
            // если у юзера сим-карта "О!" и достаточно денег на балансе для приобретения пакета,
            this.insideMin = 70; // он получает 70 минут внутри сети
            this.outsideMin = 20; // он получает 20 минут на другие сети
            this.freeSms = 15; // он получает 15 смс
            this.quantityInet = 10; // он получает 10 ГБ интернета
            this.balance = this.balance - 140.0; // с баланса списываются деньги
        }

        else if (Objects.equals(this.name, "Beeline") && this.balance >= 135.0) {
            // если у юзера сим-карта "Beeline" и достаточно денег на балансе для приобретения пакета,
            this.insideMin = 60; // он получает 60 минут внутри сети
            this.outsideMin = 15; // он получает 15 минут на другие сети
            this.freeSms = 10; // он получает 10 смс
            this.quantityInet = 18; // он получает 18 ГБ интернета
            this.balance = this.balance - 135.0; // с баланса списываются деньги
        }

        else {
            System.out.println("У вас не хватает денег на балансе");
        }
    }

    public void buyInsideMin(int min) { // метод приобретения дополнительных минут внутри сети
        this.balance = this.balance - (min * 0.7); // min - количество минут, 0.7 - стоимость 1 минуты
        this.insideMin = this.insideMin + min;
    }

    public void buyOutsideMin(int min) { // метод приобретения дополнительных минут на другие сети
        this.balance = this.balance - (min * 1.6); // min - количество минут, 1.6 - стоимость 1 минуты
        this.outsideMin = this.outsideMin + min;
    }

    public void buySms(int sms) { // метод приобретения дополнительных смс
        this.balance = this.balance - (sms * 0.6); // sms - количество смс, 0.6 - стоимость 1 смс
        this.freeSms = this.freeSms + sms;
    }

    public void buyGB(double GB) { // метод приобретения дополнительных ГБ интернета
        this.balance = this.balance - (GB * 0.9); // GB - количество ГБ, 0.6 - стоимость 1 ГБ
        this.quantityInet = this.quantityInet + GB;
    }



    @Override
    public String toString() {
        return "Информация о симкарте: \n" +
                "Оператор: " + this.name + "\n" +
                "Владелец сим-карты: " + this.user + "\n" +
                "Номер телефона: " + this.operatorCode + this.numberTel + "\n" +
                "Баланс: " + this.balance + " сом" + "\n";
    }
}
