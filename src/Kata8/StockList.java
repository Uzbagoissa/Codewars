package Kata8;

import java.util.HashMap;
import java.util.Map;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        HashMap<String, Integer> counts = new HashMap<>();
        String finish = "";
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            finish = "";
        } else {
            for (int i = 0; i < lstOf1stLetter.length; i++) {
                counts.put(lstOf1stLetter[i], 0);
                for (int j = 0; j < lstOfArt.length; j++) {
                    if (lstOf1stLetter[i].equals(String.valueOf(lstOfArt[j].charAt(0)))) {
                        if (!counts.containsKey(lstOf1stLetter[i])) {
                            counts.put(lstOf1stLetter[i], Integer.parseInt((lstOfArt[j].split(" "))[1]));
                        } else {
                            counts.put(lstOf1stLetter[i], counts.get(lstOf1stLetter[i]) + Integer.parseInt((lstOfArt[j].split(" "))[1]));
                        }
                    }
                }
            }
            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                String finish1 = "(" + entry.getKey() + " : " + entry.getValue() + ")";
                if (finish.equals("")){
                    finish = finish + finish1;
                } else {
                    finish = finish + " - " + finish1;
                }
            }
        }
        return finish;
    }
}
