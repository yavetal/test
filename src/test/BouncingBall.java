package test;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h < 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        int res = 1;

        while (window <= h * bounce) {
            h = h * bounce;

            if (window == h) {
                res += 1;
                break;
            }
            res += 2;

        }


        return res;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(11, .5, 5));
    }




























































































































































































}
