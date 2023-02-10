package test;

public class TestWhile {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.println(result +", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("inside 'while'");
        System.out.println("exited 'while'");
    }
}
