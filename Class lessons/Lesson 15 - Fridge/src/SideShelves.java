public class SideShelves {
    int countSideShelves; // количество боковых (дверных) полок холодильника
    public int getCountSideShelves() {
        return countSideShelves;
    }
    public void setCountSideShelves(int countSideShelves) {
        this.countSideShelves = countSideShelves;
    }

    public SideShelves(int count) {
        this.countSideShelves = count;
    }
}
