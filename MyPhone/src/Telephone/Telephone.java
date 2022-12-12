package Telephone;

import SimCard.Codes;
import SimCard.SimCard;

import java.util.Objects;

public class Telephone {
    private String model; // модель телефона
    private String os; // операционная система телефона

//    private Codes [] codes; // объект с массивами кодов-операторов

    private SimCard simCard;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public Telephone(String model, String os) {
        this.model = model;
        this.os = os;
    }

    public void call(String code, String number, double minutes) { // метод звонка
        if (!Objects.equals(simCard.getOperatorCode(), code) && minutes <= simCard.getOutsideMin()) {
            // если вы позвоните человеку с другим кодом, и при этом у вас достаточно минут звонков в другие сети,
            this.simCard.setOutsideMin(this.simCard.getOutsideMin() - minutes);
            // в сеттере остается остаточное количество минут (минуты в другие сети - количество потраченных минут на звонок)
            System.out.printf("Вы позвонили на номер %s%s. \n" +
                    "Длительность звонка: %.1f минут(ы). У вас осталось: %.2f минут(ы) звонков на другие сети",
                    code, number, minutes, this.simCard.getOutsideMin());
            // рапортуем о проведенной операции
        }

        else if (Objects.equals(simCard.getOperatorCode(), code) && minutes <= simCard.getInsideMin()){
            // если вы позвоните человеку, у которого такой оператор, и при этом у вас достаточно минут звонков внутри сети,
            this.simCard.setInsideMin(this.simCard.getInsideMin() - minutes);
            // в сеттере остается остаточное количество минут (минуты внутри сети - количество потраченных минут на звонок)
            System.out.printf("Вы позвонили на номер %s%s. \n" +
                    "Длительность звонка: %.1f минут(ы). У вас осталось: %.2f минут(ы) звонков внутри сети",
                    code, number, minutes, this.simCard.getInsideMin());
            // рапортуем о проведенной операции
        }

        else if (minutes > simCard.getInsideMin() && this.simCard.getBalance() > 0 ||
                minutes > simCard.getOutsideMin() && this.simCard.getBalance() > 0) {
            // если звонок занимает больше времени, чем у вас осталось минут внутри/вне сети, и при этом у вас есть деньги на балансе
            if (minutes > simCard.getInsideMin()) {
                // если звонок занимает больше времени, чем у вас осталось минут внутри сети
                double payMinutes = minutes - simCard.getInsideMin(); // подсчитывается сумма денег за лишние минуты разговора вне пакета
                this.simCard.setBalance(this.simCard.getBalance() - (payMinutes * 0.8)); // баланс уменьшается на сумму этих денег
                System.out.printf("Вы позвонили на номер %s%s. \n" +
                        "Длительность звонка: %.1f минут(ы), но в процессе разговора у вас закончился пакет. " +
                        "Дальнейшее время разговора было платным, оно составило: %.2f сом. " +
                        "Ваш баланс составляет: %.2f сом" +
                        "У вас не осталось минут внутри сети", code, number, minutes, payMinutes * 0.8, this.simCard.getBalance());
                this.simCard.setInsideMin(0.0); // все минуты внутри сети обнуляются, то есть вы проговорили остаток пакета
            }

            else if (minutes > simCard.getOutsideMin()) {
                // если звонок занимает больше времени, чем у вас осталось минут на другие сети
                double payMinutes = minutes - simCard.getOutsideMin(); // подсчитывается сумма денег за лишние минуты разговора вне пакета
                this.simCard.setBalance(this.simCard.getBalance() - (payMinutes * 1.7)); // баланс уменьшается на сумму этих денег
                System.out.printf("Вы позвонили на номер %s%s. \n" +
                        "Длительность звонка: %.1f минут(ы), но в процессе разговора у вас закончился пакет. " +
                        "Дальнейшее время разговора было платным, оно составило: %.2f сом. " +
                        "Ваш баланс составляет: %.2f сом" +
                        "У вас не осталось минут внутри сети", code, number, minutes, payMinutes * 1.7, this.simCard.getBalance());

                this.simCard.setOutsideMin(0.0); // все минуты на другие сети обнуляются, то есть вы проговорили остаток пакета
            }
        }

        else if (minutes > simCard.getInsideMin() && this.simCard.getBalance() <= 0 ||
                minutes > simCard.getOutsideMin() && this.simCard.getBalance() <= 0) {
            // если у вас не хватает минут разговора и баланс симки <= 0,
            System.out.println("Уважаемый абонент. Ваш звонок не состоялся из-за отсутствия средств на балансе." + "\n" +
                    "Пожалуйста, пополните баланс."); // уведомляем абонента об отсутствии денег на сим-карте
        }
    }

    public void sendSms(String code, String number, String text) { // метод отправки СМС
        if (!Objects.equals(simCard.getOperatorCode(), code) && simCard.getFreeSms() > 0 ||
                Objects.equals(simCard.getOperatorCode(), code) && simCard.getFreeSms() > 0) {
            // если вы отправите смс человеку, и при этом у вас достаточно смс в пакете,
            this.simCard.setFreeSms(this.simCard.getFreeSms() - 1);
            // в сеттере остается остаточное количество смс (кол-во смс в пакете - 1)
            System.out.printf("Вы отправили СМС на номер %s%s. \n" +
                    "Текст сообщения: %s. У вас осталось: %d смс в пакете",
                    code, number, text, this.simCard.getFreeSms());
            // рапортуем о проведенной операции
        }
        else if (simCard.getFreeSms() == 0 && this.simCard.getBalance() > 0) {
            // если в пакете нет бесплатных смс, но есть деньги на сим-карте
            this.simCard.setBalance(this.simCard.getBalance() - 0.8); // баланс уменьшается на сумму этих денег за отправку СМС
            System.out.printf("Вы отправили СМС на номер %s%s. \n" +
                    "Текст сообщения: %s. Так как у вас в пакете нет бесплатных СМС, отправка СМС стоит: %.1f сом. Ваш баланс составляет: %.2f",
                    code, number, text, 0.8, this.simCard.getBalance());
            // рапортуем о проведенной операции
        }

        else if (simCard.getFreeSms() == 0 && this.simCard.getBalance() <= 0) {
            // если в пакете нет бесплатных смс, и нет денег на сим-карте
            System.out.println("Уважаемый абонент. СМС не отправлено из-за отсутствия средств на балансе." + "\n" +
                    "Пожалуйста, пополните баланс."); // уведомляем абонента об отсутствии денег на сим-карте
        }
    }

    public void enterToInternet(double GB) { // метод интернет-сеанса
        if (GB < simCard.getQuantityInet()) { // если количество ГБ интернет за сеанс не превышает остаток ГБ в пакете
            this.simCard.setQuantityInet(this.simCard.getQuantityInet() - GB); // кол-вл ГБ уменьшается на кол-во использованных ГБ юзером
            System.out.printf("За интернет-сеанс вы потратили %.2f ГБ \n" +
                            "У вас осталось: %.2f ГБ в пакете",
                    GB, this.simCard.getQuantityInet());
        }

        else if (GB > simCard.getQuantityInet() && this.simCard.getBalance() > 0) { // если в пакете нет бесплатных ГБ (или есть, но их недостаточно), но есть деньги на сим-карте

        }

    }

    @Override
    public String toString() {
        return "Характеристики телефона: \n" +
                "Модель: " + this.model + "\n" +
                "Операционная система: " + this.os + "\n";
    }
}
