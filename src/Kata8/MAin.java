package Kata8;

public class MAin {
    public static void main(String[] args) {
        String[] lstOfArt = {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] lstOf1stLetter = {"A", "B"};
        System.out.println(StockList.stockSummary(lstOfArt, lstOf1stLetter));
    }
}
