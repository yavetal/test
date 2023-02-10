package test;

public class PassObject {

    public static void main(String[] args) {
        Letter x = new Letter();
        x.setC('a'); ;
        System.out.println("1: x.c : " + x.out());
        f(x);
        System.out.println("2: x.c : " + x.out());

    }
    static void f(Letter y) {
        y.setC('z');
    }

}
