import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Какую валюту вы хотите поменять: ");
        String userValute = sc.nextLine(); // юзер вводит валюту, которую он хочет поменять

        String [] valutes = {"Доллар", "Евро", "Рубль", "Тенге", "Сом"};
        double usdRates, eurRates, rubRates, kztRates, kgzRates;

        for (String valute : valutes) { // проходим по всему списку валют
            if (userValute.equals(valute)) { // если обмениваемая валюта пользователя есть в массиве
                System.out.print("На какую валюту вы хотите обменять: "); // спрашиваем пользователя
                String userNewValute = sc.nextLine(); // юзер вводит валюту, на которую он хочет обменяться

                for (String s : valutes) { // проходим по всему списку валют
                    if (userNewValute.equals(s)) { // если новая валюта  есть в массиве

                        System.out.print("Какое количество валюты вы хотите обменять: "); // спрашиваем пользователя
                        int countMoney = sc.nextInt(); // юзер вводит количество своей валюты, которую он хочет обменять

                        switch (userNewValute) {
                            case "Сом" -> { // курс валют сома
                                usdRates = 83.5;
                                eurRates = 82.86;
                                rubRates = 1.35;
                                kztRates = 0.17;

                                switch (userValute) {
                                    case "Доллар" -> { // доллар меняем на сом
                                        int finalSum = (int) (countMoney * usdRates);
                                        System.out.println("Сумма в сомах: " + finalSum);
                                    }
                                    case "Евро" -> { // евро меняем на сом
                                        int finalSum = (int) (countMoney * eurRates);
                                        System.out.println("Сумма в сомах: " + finalSum);
                                    }
                                    case "Рубль" -> { // рубль меняем на сом
                                        int finalSum = (int) (countMoney * rubRates);
                                        System.out.println("Сумма в сомах: " + finalSum);
                                    }
                                    case "Тенге" -> { // тенге меняем на сом
                                        int finalSum = (int) (countMoney * kztRates);
                                        System.out.println("Сумма в сомах: " + finalSum);
                                    }
                                }
                            }

                            case "Доллар" -> { // курс валют доллара
                                eurRates = 0.99;
                                rubRates = 0.016;
                                kztRates = 0.0022;
                                kgzRates = 0.012;

                                switch (userValute) {
                                    case "Евро" -> { // Евро меняем на доллар
                                        int finalSum = (int) (countMoney * eurRates);
                                        System.out.println("Сумма в долларах: " + finalSum);
                                    }
                                    case "Рубль" -> { // Рубль меняем на доллар
                                        int finalSum = (int) (countMoney * rubRates);
                                        System.out.println("Сумма в долларах: " + finalSum);
                                    }
                                    case "Тенге" -> { // Тенге меняем на доллар
                                        int finalSum = (int) (countMoney * kztRates);
                                        System.out.println("Сумма в долларах: " + finalSum);
                                    }
                                    case "Сом" -> { // Сом меняем на доллар
                                        int finalSum = (int) (countMoney * kgzRates);
                                        System.out.println("Сумма в долларах: " + finalSum);
                                    }
                                }
                            }
                            case "Евро" -> { // курс валют евро
                                usdRates = 1.01;
                                rubRates = 0.0016;
                                kztRates = 0.0022;
                                kgzRates = 0.012;

                                switch (userValute) {
                                    case "Доллар" -> { // Доллар меняем на евро
                                        int finalSum = (int) (countMoney * usdRates);
                                        System.out.println("Сумма в евро: " + finalSum);
                                    }
                                    case "Рубль" -> { // Рубль меняем на евро
                                        int finalSum = (int) (countMoney * rubRates);
                                        System.out.println("Сумма в евро: " + finalSum);
                                    }
                                    case "Тенге" -> { // Тенге меняем на евро
                                        int finalSum = (int) (countMoney * kztRates);
                                        System.out.println("Сумма в евро: " + finalSum);
                                    }
                                    case "Сом" -> { // Сом меняем на евро
                                        int finalSum = (int) (countMoney * kgzRates);
                                        System.out.println("Сумма в евро: " + finalSum);
                                    }
                                }
                            }
                            case "Рубль" -> { // курс валют рубля
                                usdRates = 62.02;
                                eurRates = 61.3;
                                kztRates = 0.13;
                                kgzRates = 0.74;

                                switch (userValute) {
                                    case "Доллар" -> { // Доллар меняем на рубль
                                        int finalSum = (int) (countMoney * usdRates);
                                        System.out.println("Сумма в рублях: " + finalSum);
                                    }
                                    case "Евро" -> { // Евро меняем на рубль
                                        int finalSum = (int) (countMoney * eurRates);
                                        System.out.println("Сумма в рублях: " + finalSum);
                                    }
                                    case "Тенге" -> { // Тенге меняем на рубль
                                        int finalSum = (int) (countMoney * kztRates);
                                        System.out.println("Сумма в рублях: " + finalSum);
                                    }
                                    case "Сом" -> { // Сом меняем на рубль
                                        int finalSum = (int) (countMoney * kgzRates);
                                        System.out.println("Сумма в рублях: " + finalSum);
                                    }
                                }
                            }
                            case "Тенге" -> { // курс валют тенге
                                usdRates = 464.72;
                                eurRates = 459.32;
                                rubRates = 7.49;
                                kgzRates = 5.57;

                                switch (userValute) {
                                    case "Доллар" -> { // Доллар меняем на тенге
                                        int finalSum = (int) (countMoney * usdRates);
                                        System.out.println("Сумма в тенге: " + finalSum);
                                    }
                                    case "Евро" -> { // Евро меняем на тенге
                                        int finalSum = (int) (countMoney * eurRates);
                                        System.out.println("Сумма в тенге: " + finalSum);
                                    }
                                    case "Рубль" -> { // Рубль меняем на тенге
                                        int finalSum = (int) (countMoney * rubRates);
                                        System.out.println("Сумма в тенге: " + finalSum);
                                    }
                                    case "Сом" -> { // Сом меняем на тенге
                                        int finalSum = (int) (countMoney * kgzRates);
                                        System.out.println("Сумма в тенге: " + finalSum);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}