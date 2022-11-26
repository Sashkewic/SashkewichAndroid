public class Megacom extends Telephone{
    private double callCost; // стоимость 1 минуты звонка на другие операторы
    private double smsCost; // стоимость отправки 1 смс на другие операторы
    private double internetCost = 40; // стоимость 1 ГБ интернет-трафика

    public double getCallCost() {
        return callCost;
    }
    public void setCallCost(double callCost) {
        this.callCost = callCost;
    }

    public double getSmsCost() {
        return smsCost;
    }
    public void setSmsCost(double smsCost) {
        this.smsCost = smsCost;
    }

    public double getInternetCost() {
        return internetCost;
    }
    public void setInternetCost(double internetCost) {
        this.internetCost = internetCost;
    }

    public Megacom() {}
    public Megacom(double balance) {
        super(balance);
    }

    @Override
    public void callTo(String phoneNumber, double countMinutes){ // метод, позволяющий звонить на чей-то номер
        this.phoneNumber = phoneNumber; // номер телефона, на который будем звонить

        if (phoneNumber.startsWith("077") || phoneNumber.startsWith("070")){ // если номер телефона начинается на 077 или 070,
            setCallCost(1.05);
            this.balance = this.balance - (countMinutes * this.callCost); // баланс на сим-карте после звонка на другие сети
            System.out.printf("Вы позвонили на номер: %s. Это был звонок на другие сети. \n" +
                            "Звонок длился %.1f минут(ы) \n" +
                            "Вы потратили %.2f сом на звонок, ваш баланс составляет: %.2f сом \n" + "\n",
                    phoneNumber, countMinutes, (countMinutes * this.callCost), this.balance);
        }

        else { // если номер телефона начинается на 055, то есть номер телефона принадлежит Megacom
            setCallCost(0);
            System.out.printf("Вы позвонили на номер: %s. Это номер принадлежит оператору Megacom. \n" +
                            "Звонок длился %.1f минут(ы) \n" +
                            "Звонок внутри сети бесплатный, то есть %.1f сом. Ваш баланс по-прежнему составляет: %.2f сом \n" + "\n",
                    phoneNumber, countMinutes, (countMinutes * this.callCost),  this.balance);
        }
    }

    @Override
    public void sendSms(String phoneNumber, String text){ // метод, позволяющий отправлять СМС-сообщения на чей-то номер
        this.phoneNumber = phoneNumber; // номер телефона, которому мы отправим смс-сообщение

        if (phoneNumber.startsWith("077") || phoneNumber.startsWith("070")){ // если номер телефона начинается на 077 или 070,
            setSmsCost(1.7);
            this.balance = this.balance - smsCost; // баланс на сим-карте после отправки смс-сообщения на другие сети
            System.out.printf("Вы написали СМС-сообщение на номер: %s. СМС-сообщение отправлено на номер других сетей." + "\n" +
                    "Его содержание: %s" + "\n" +
                    "Стоимость смс составляет: %.2f сом" + "\n" +
                    "После отправки СМС-сообщения ваш баланс составляет %.2f сом \n" + "\n", phoneNumber, text, smsCost, this.balance);
        }

        else { // если номер телефона начинается на 055, то есть номер телефона принадлежит Megacom
            setSmsCost(0);
            System.out.printf("Вы написали СМС-сообщение на номер: %s. СМС-сообщение отправлено на номер Megacom." + "\n" +
                    "Его содержание: %s" + "\n" +
                    "Отправка СМС-сообщения на этот номер бесплатна" + "\n" +
                    "После отправки СМС-сообщения ваш баланс по-прежнему составляет %.2f сом \n" + "\n", phoneNumber, text, this.balance);
        }
    }

    @Override
    public void enterToInternet(double countGB){ // метод, позволяющий выйти в интернет
        this.balance = this.balance - (internetCost * countGB); // баланс на сим-карте после выхода в интернет
        System.out.printf("Вы совершили интернет-сеанс. Вы потратили %.1f ГБ " + "\n" +
                "Стоимость интернет-сеанса составляет: %.2f сом." + "\n" +
                "После выхода в интернет ваш баланс составляет %.2f сом \n" + "\n", countGB, (internetCost * countGB), this.balance);
    }
}