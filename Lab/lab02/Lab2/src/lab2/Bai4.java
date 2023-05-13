package lab2;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("+------------------------------+");
        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("+------------------------------+");

        System.out.println("Chon chuc nang (1-4): ");
        try {
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {

                switch (choice) {
                    case 1:
                        Bai1.equation1();
                        break;
                    case 2:
                        Bai2.equation2();
                        break;
                    case 3:
                        Bai3.electric();
                        break;
                    case 4:
                        break;

                }
            } else {
                System.out.println("Enter a number just from 1 to 4!");
            }
        } catch (Exception e) {
            System.out.println("Enter only a number from 1 to 4");
        }
    }
}
