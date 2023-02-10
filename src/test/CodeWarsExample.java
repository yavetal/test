package test;

public class CodeWarsExample {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;


    }

    public static boolean isPrime1(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;


    }

    public static boolean isNarcissistic(int number) {
        char[] arr = Integer.toString(number).toCharArray();
        int res = 0;
        for (char a: arr) {
            int b = Integer.parseInt(String.valueOf(a));
            res += + Math.pow(b, arr.length);
        }
        return res == number;
    }

}
