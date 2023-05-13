package lab2;

import java.util.Scanner;

public class Bai1 {

    public static void equation1() {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0;

        System.out.println("a*x + b = 0");

        try {
            System.out.println("Enter a = ");
            a = sc.nextDouble();
            System.out.println("Enter b = ");
            b = sc.nextDouble();
            if (a == 0) {
                if (b == 0) {
                    System.out.println("The equation has infinitely many solutions");
                } else {
                    System.out.println("The equation has no solution");
                }
            } else {
                System.out.println("The solution of the equation is x = " + (-b / a));
            }
        } catch (Exception e) {
            System.out.println("Enter number please!!!");
        }

    }

    public static void main(String[] args) {
        equation1();
    }
}
