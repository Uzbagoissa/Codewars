package Kata6;

import java.util.ArrayList;

public class DeadFish {
    public static int[] parse(String data) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        int beginNumber = 0;
        for (int i = 0; i < data.length(); i++) {
            String numberStr = String.valueOf(data.charAt(i));
            if (numberStr.equals("i")){
                beginNumber++;
            } else if (numberStr.equals("d")){
                beginNumber--;
            } else if (numberStr.equals("s")){
                beginNumber = beginNumber * beginNumber;
            } else if (numberStr.equals("o")){
                numbersList.add(beginNumber);
            } else {
                continue;
            }
        }
        int[] numbers = new int[numbersList.size()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbersList.get(i);
        }
        return numbers;
    }
}
