package test;

public class Kata {
    public static String incrementString(String str) {
        char [] simbol = str.toCharArray();
        int count = 0;
        for(int i = simbol.length -1; i >= 0; i--) {
         if(simbol[i] == '9'){
             count ++;
             continue;
         }

         if(simbol[i] == '0'
            || simbol[i] == '1'
            || simbol[i] == '2'
            || simbol[i] == '3'
            || simbol[i] == '4'
            || simbol[i] == '5'
            || simbol[i] == '6'
            || simbol[i] == '7'
            || simbol[i] == '8'){
             count++;
             break;
        }
        break;
    }
        if(count == 0){
            return str + 1;
        }

        String in = str.substring(0, str.length() - count);
        String en = str.substring(str.length() - count);
        System.out.println(en);
        System.out.println(count);
        return  in + (Integer.parseInt(en) +1);

}

    public static void main(String[] args) {
        System.out.println(incrementString("g99ldc01"));
    }
}
