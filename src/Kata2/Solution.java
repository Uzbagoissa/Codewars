package Kata2;

public class Solution {
    public static String whoLikesIt(String[] names) {
        String o = "";
        if (names.length == 0){
            o = "no one likes this";
        } else if (names.length == 1){
            o = names[0] + " likes this";
        } else if (names.length == 2){
            o = names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3){
            o = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            o = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
        return o;
    }
}
