public class Main {
    public static void main(String[] args) {
        Megacom megaNum = new Megacom(); // мы купили сим-карту сети "Megacom",
        megaNum.setBalance(200); // положили на баланс телефона 200 сом
        megaNum.callTo("0700123456", 5);
        megaNum.callTo("0777337397", 5);
        megaNum.callTo("0551337397", 5);
        megaNum.sendSms("0700123456", "Привет, я дома. Можешь позвонить один раз");
        megaNum.sendSms("0777337397", "Привет, я дома. Можешь позвонить два раза");
        megaNum.sendSms("0551337397", "Привет, я дома. Можешь позвонить много раз");
        megaNum.enterToInternet(2.5);

        O oNum = new O(); // мы купили сим-карту сети "О!",
        oNum.setBalance(200); // положили на баланс телефона 200 сом
        oNum.callTo("0551337397", 5);
        oNum.callTo("0777337397", 5);
        oNum.callTo("0700123456", 5);
        oNum.sendSms("0551337397", "Привет, я дома. Можешь позвонить один раза");
        oNum.sendSms("0777337397", "Привет, я дома. Можешь позвонить два раза");
        oNum.sendSms("0700123456", "Привет, я дома. Можешь позвонить много раз");
        oNum.enterToInternet(2.5);

        Beeline beelineNum = new Beeline(); // мы купили сим-карту сети "Beeline",
        beelineNum.setBalance(200); // положили на баланс телефона 200 сом
        beelineNum.callTo("0551337397", 5);
        beelineNum.callTo("0700123456", 5);
        beelineNum.callTo("0777337397", 5);
        beelineNum.sendSms("0551337397", "Привет, я дома. Можешь позвонить один раза");
        beelineNum.sendSms("0700123456", "Привет, я дома. Можешь позвонить два раза");
        beelineNum.sendSms("0777337397", "Привет, я дома. Можешь позвонить много раз");
        beelineNum.enterToInternet(2.5);
    }
}