package Kata3;

public class BitCounting {

    public static int countBits(int n){
        String result = Integer.toBinaryString(n);
        int sumOf1 = 0;
        for (int i = 0; i < result.length(); i++) {
            String numberStr = String.valueOf(result.charAt(i));
            if (numberStr.equals("1")){
                int number = Integer.parseInt(numberStr);
                sumOf1 = sumOf1 + number;
            }
        }
        return sumOf1;
    }
}
