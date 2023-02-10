package test;

import java.math.BigInteger;

public class Kata1 {
    Character a;
    public static String dop(String str, int l){

        StringBuilder a = new StringBuilder( str );
        a.reverse();
        for( int i = str.length(); i <= l; i++ ){
           a.append( '0' );
        }
        return a.reverse().toString();
    }
    public static String add( String a, String b ) {
        int len = a.length() > b.length() ? a.length() : b.length();
        if( a.length() > b.length() ){
            b = dop(b, len);
        }
        if( a.length() < b.length() ){
            a = dop( a, len );
        }
        StringBuilder sa = new StringBuilder( a );
        StringBuilder sb = new StringBuilder( b );
        a = sa.reverse().toString();
        b = sb.reverse().toString();
        char[] ara = a.toCharArray();
        char[] arb = b.toCharArray();
        int count = 0;
        String res = "";
        for( int i = 0; i < len; i++ ){
            int q = Integer.parseInt( String.valueOf( ara[i] ) )
                    + Integer.parseInt( String.valueOf( arb[i] ) )
                    + count;
            if( q >= 10){
                count = 1;
                res += q%10;
            } else {
                res += q;
                count = 0;
            }
        }
        if( count == 1){
            res += 1;

        }
        StringBuilder out = new StringBuilder( res );
        res = out.reverse().toString();
        System.out.println( res );
        for( int i = 0; i < res.length(); i++ ){
            System.out.println( res.charAt( 0 ) );
           if(res.charAt( 0 ) == '0' ){
              res = res.substring(1);
           } else {
               break;

           }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(add("40", "001"));
    }

}
