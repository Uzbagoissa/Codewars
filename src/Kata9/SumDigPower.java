package Kata9;

import java.util.ArrayList;
import java.util.List;

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new ArrayList<>();
        for (long i = a; i <= b ; i++) {
            int degree = 1;
            long number = 0;
            for (int j = 0; j < Long.toString(i).length(); j++) {
                number = number + (long) Math.pow(Long.parseLong(String.valueOf(Long.toString(i).charAt(j))), degree);
                degree++;
            }
            if (number == i){
                list.add(number);
            }
        }
        return list;
    }
}
