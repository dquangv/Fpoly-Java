package lab2;

import java.util.Scanner;

public class Bai3 {

    public static void electric() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Used electronic volume:");

        try {
            int elecVol = sc.nextInt();
            if (elecVol < 0) {
                System.out.println("Please enter positive number!");
            } else if (elecVol < 50) {
                System.out.println("You must pay " + (elecVol * 1000) + " dong");
            } else {
                System.out.println("You must pay " + (50 * 1000 + (elecVol - 50) * 1200) + " dong");
            }
        } catch (Exception e) {
            System.out.println("Please enter only positive number!");
        }
    }

    public static void main(String[] args) {
        electric();
    }
}
