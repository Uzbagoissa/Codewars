package Kata4;

import java.util.ArrayList;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        ArrayList<String> listOfSum = new ArrayList<>();
        String word = "";
        if (strarr.length == 0 || k > strarr.length || k <= 0){
            word = "";
        } else {
            for (int i = 0; i < strarr.length; i++) {
                if (i < (strarr.length - (k - 1))) {
                    String sum1 = "";
                    for (int j = (i + 1); j < (i + k); j++) {
                        if (j < (strarr.length)) {
                            sum1 = sum1 + strarr[j];
                        }
                    }
                    String sum = strarr[i] + sum1;
                    listOfSum.add(sum);
                }
            }
            int max = 0;
            for (int i = 0; i < listOfSum.size(); i++) {
                if (listOfSum.get(i).length() > max){
                    max = listOfSum.get(i).length();
                    word = listOfSum.get(i);
                }
            }
        }
        return word;
    }
}
