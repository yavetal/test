package test;
import java.math.*;
import java.util.Arrays;

public class  ProdFib {
    public static long[] ProductFib(long prod){
        long[] fib = new long[50];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i< 48; i++){
           fib[i] = fib[i - 2] + fib[i - 1];
           long a = fib[i] * fib[i -1];
           if(a < prod){
               continue;
           }
           if(a == prod) {
               return new long[]{fib[i - 1], fib[i], 1};
           }

            return  new long[]{fib[i - 1], fib[i], 0};


        }
        return new long[3];

    }
        public static void main(String[] args) {
        System.out.println(Arrays.toString(ProductFib(12817)));

    }

}
