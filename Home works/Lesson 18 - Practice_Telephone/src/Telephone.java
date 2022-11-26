public class Telephone {
    protected double balance; // количество денег на балансе
    protected String phoneNumber; // номер телефона, на который мы будем совершать звонки и писать СМС-сообщения



    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Telephone(){}

    protected Telephone(double balance){
        this.balance = balance;
    }

    public void callTo(String phoneNumber, double countMinutes){ // метод, позволяющий звонить на чей-то номер
        this.phoneNumber = phoneNumber;
        System.out.println("Вы позвонили на номер: " + phoneNumber + ". " + "Звонок длился " + countMinutes + " минут(ы)");
    }

    public void sendSms(String phoneNumber, String text){ // метод, позволяющий отправлять СМС-сообщения на чей-то номер
        this.phoneNumber = phoneNumber;
        System.out.println("Вы написали СМС-сообщение на номер: " + phoneNumber + ". " + "Его содержание: " + text);
    }

    public void enterToInternet(double countGB){ // метод, позволяющий выйти в интернет
        System.out.println("Вы совершили сеанс серфинга по интернету. Вы потратили " + countGB + " ГБ");
    }

    public String toString () {
        return "Ваш баланс на вашей сим-карте составляет: " + this.balance;
    }
}
