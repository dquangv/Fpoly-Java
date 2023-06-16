package de1;

import java.util.Scanner;

public class Bai2 {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        do {
            System.out.println("MENU");
            System.out.println("1.Tong chan, tong le trong mang");
            System.out.println("2. So nguyen to trong mang");
            System.out.println("3. Ket thuc");
            System.out.println("Chon so: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("TONG CHAN, TONG LE TRONG MANG");
                    Bai1.tongChan_tongLe(arr);
                    break;
                case 2:
                    System.out.println("SO NGUYEN TO TRONG MANG");
                    Bai1.soNguyenTo(arr);
                    break;
                case 3:
                    System.out.println("Cam on da su dung chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("nhap sai goi ma");
                    break;
            }

            System.out.println("Su dung nua hom? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                System.out.println("Cam on da su dung chuong trinh");
                break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        menu();
    }
}
