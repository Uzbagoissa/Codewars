package Kata5;

import java.util.ArrayList;
import java.util.HashMap;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        ArrayList<Integer> decimal = getDecimal();
        ArrayList<String> hexadecimal = getHexadecimal();
        HashMap<Integer, String> total = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            total.put(decimal.get(i), hexadecimal.get(i));
        }
        String totalR;
        String totalG;
        String totalB;
        if (r > 255){
            totalR = total.get(255);
        } else if (r < 0){
            totalR = total.get(0);
        } else {
            totalR = total.get(r);
        }
        if (g > 255){
            totalG = total.get(255);
        } else if (g < 0){
            totalG = total.get(0);
        } else {
            totalG = total.get(g);
        }
        if (b > 255){
            totalB = total.get(255);
        } else if (b < 0){
            totalB = total.get(0);
        } else {
            totalB = total.get(b);
        }
        String finish = totalR + totalG + totalB;
        return finish;
    }

    public static ArrayList<Integer> getDecimal() {
        ArrayList<Integer> decimal = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < 256; i++) {
            decimal.add(s);
            s++;
        }
        return decimal;
    }

    public static ArrayList<String> getHexadecimal() {
        HashMap<Integer, String> codes = new HashMap<>();
        ArrayList<String> hexadecimal = new ArrayList<>();
        codes.put(0, "A");
        codes.put(1, "B");
        codes.put(2, "C");
        codes.put(3, "D");
        codes.put(4, "E");
        codes.put(5, "F");
        int a = 0;
        int l = 0;
        for (int i = 0; i < 10; i++) {
            int f = 0;
            for (int j = 0; j < 10; j++) {
                hexadecimal.add(a + Integer.toString(f));
                f++;
            }
            hexadecimal.add(a + "A");
            hexadecimal.add(a + "B");
            hexadecimal.add(a + "C");
            hexadecimal.add(a + "D");
            hexadecimal.add(a + "E");
            hexadecimal.add(a + "F");
            a++;
        }
        for (int i = 0; i < 6; i++) {
            int f = 0;
            for (int j = 0; j < 10; j++) {
                hexadecimal.add(codes.get(l) + f);
                f++;
            }
            hexadecimal.add(codes.get(l) + "A");
            hexadecimal.add(codes.get(l) + "B");
            hexadecimal.add(codes.get(l) + "C");
            hexadecimal.add(codes.get(l) + "D");
            hexadecimal.add(codes.get(l) + "E");
            hexadecimal.add(codes.get(l) + "F");
            l++;
        }
        return hexadecimal;
    }
}

/*Сверху атомный пиздец. Все решается проще путем String.format("%02x", bytes) - форматируем байты в шестнадцатеричные:

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        if(r < 0) r = 0;
        if(g < 0) g = 0;
        if(b < 0) b = 0;
        if(r > 255) r = 255;
        if(g > 255) g = 255;
        if(b > 255) b = 255;

        return String.format("%02X%02X%02X", r, g, b);
    }
}*/


