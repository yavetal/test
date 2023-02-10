package test;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        if(r < 0){
            r = 0;
        }
        if(r > 255){
            r = 255;
        }
        if(g < 0){
            g = 0;
        }
        if(g > 255){
            g = 255;
        }
        if(b < 0){
            b = 0;
        }
        if(b > 255){
            b = 255;
        }
        String rHex = Integer.toHexString(r);
        rHex = rHex.length() < 2 ? rHex = "0" + rHex : rHex;
        String gHex = Integer.toHexString(g);
        gHex = gHex.length() < 2 ? gHex = "0" + gHex : gHex;
        String bHex = Integer.toHexString(b);
        bHex = bHex.length() < 2 ? bHex = "0" + bHex : bHex;
        String res = rHex + gHex + bHex;
        return res.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(rgb(-20, 275, 125));

    }
}
