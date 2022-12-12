package SimCard;

import java.util.Arrays;

public class Codes {
    // поля
    private String [] megaCodes = {"0550", "0551", "0552", "0553", "0554", "0555", "0556", "0557", "0558", "0559"};
    private String [] oCodes = {"0500", "0501", "0502", "0503", "0504", "0505", "0506", "0507", "0508", "0509",
            "0700", "0701", "0702", "0703", "0704", "0705", "0706", "0707", "0708", "0709"};
    private String [] beelineCodes = {"0770", "0771", "0772", "0773", "0774", "0775", "0776", "0777", "0778", "0779"};

    // геттеры и сеттеры
    public String[] getMegaCodes() {
        return megaCodes;
    }
    public void setMegaCodes(String[] megaCodes) {
        this.megaCodes = megaCodes;
    }

    public String[] getoCodes() {
        return oCodes;
    }
    public void setoCodes(String[] oCodes) {
        this.oCodes = oCodes;
    }

    public String[] getBeelineCodes() {
        return beelineCodes;
    }
    public void setBeelineCodes(String[] beelineCodes) {
        this.beelineCodes = beelineCodes;
    }

    @Override
    public String toString(){
        return "Список кодов: \n" +
                "Megacom: " + Arrays.toString(megaCodes) + "\n" +
                "О!: "  + Arrays.toString(oCodes) + "\n" +
                "Beeline: " + Arrays.toString(beelineCodes) + "\n";
    }
}
