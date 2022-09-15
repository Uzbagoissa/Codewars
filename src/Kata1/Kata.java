package Kata1;

public class Kata {

    public static void main(String[] args) {
        squareDigits(98768);
    }

    public static void squareDigits(int n) {
        String a = Integer.toString(n);
        char[] result = a.toCharArray();
        for (int i = 0; i < result.length; i++) {
            int y = Integer.parseInt(String.valueOf(result[i]));
            int h = y * y;
        }
    }
}
