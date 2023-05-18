package lab3;

import java.util.Scanner;

public class Bai1 {

    public static void prime(int num) {
        boolean check = true;

        if (num == 1) {
            System.out.println("This number is not prime");
        } else {
            for (int index = 2; index <= num / 2; index++) {
                if ((num % index == 0)) {
                    check = false;
                    break;
                }
            }

            String prime = check == true ? "This number is prime" : "This number is not prime";
            System.out.println(prime);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check:");
        int num = sc.nextInt();

        prime(num);
    }
}
