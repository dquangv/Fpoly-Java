package lab2;

import java.util.Scanner;

public class Bai2 {

    public static void equation2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("a*x^2 + b*x + c = 0");
        try {
            System.out.println("Enter a =");
            double a = sc.nextDouble();
            System.out.println("Enter b =");
            double b = sc.nextDouble();
            System.out.println("Enter c =");
            double c = sc.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("The equation has infinitely many solutions");
                    } else {
                        System.out.println("The equation has no solution");
                    }
                } else {
                    System.out.println("The solution of the equation is x = " + (-c / b));
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("The equation has no solution");
                } else if (delta == 0) {
                    System.out.println("The equation with a double solution is x = " + (-b / 2 * a));
                } else {
                    System.out.println("The equation has two solutions x = " + ((-b + Math.sqrt(delta)) / 2 * a) + " and x = " + ((-b - Math.sqrt(delta)) / 2 * a));
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter only numbers");
        }

    }

    public static void main(String[] args) {
        equation2();
    }
}
