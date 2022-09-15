package Kata7;

public class Prime {
    public static boolean isPrime(int num) {
        if ((num <= 1)){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % (i) == 0){
                return false;
            }
        }
        return true;
    }
}






//Вариант с тестом на простоту через класс BigInteger

/*import java.math.BigInteger;

public class Prime {
    public static boolean isPrime(int num) {
        boolean probablePrime;
        if ((num <= 0) || (num == 1)){
            return false;
        } else {
            BigInteger bigInteger = BigInteger.valueOf(num);
            probablePrime = bigInteger.isProbablePrime((int) Math.log(num));
        }
        return probablePrime;
    }
}*/
