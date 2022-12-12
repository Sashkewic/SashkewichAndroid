import SimCard.SimCard;
import Telephone.Telephone;
import SimCard.Codes;

public class Main {
    public static void main(String[] args) {
        Telephone myTelephone = new Telephone("Samsung Galaxy A90 5G", "Android");
        System.out.println(myTelephone);

        SimCard megacom1 = new SimCard("Megacom", "Александр Живайкин", "0551", "337397", 50);
        megacom1.replenishBalance(100);
        System.out.println(megacom1);

        Codes codes = new Codes();
        System.out.println(codes);
    }
}