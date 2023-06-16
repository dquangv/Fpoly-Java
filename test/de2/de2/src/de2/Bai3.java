package de2;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai2 ds = new Bai2();
        
        while (true) {
            System.out.println("MENU");
            System.out.println("1.Nhap 1 doi tuong hoac danh sach doi tuong");
            System.out.println("2.Xuat 1 doi tuong hoac danh sach doi tuong");
            System.out.println("3.Xuat danh sach cac sinh vien qua mon");
            System.out.println("4.Tim sinh vien theo ma");
            System.out.println("0.Thoat");

            System.out.println("Chon so: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("NHAP 1 DOI TUONG HOAC DANH SACH DOI TUONG");
                    ds.nhapSV();
                    break;
                case 2:
                    System.out.println("XUAT 1 DOI TUONG HOAC DANH SACH DOI TUONG");
                    ds.xuatSV();
                    break;
                case 3:
                    System.out.println("XUAT DANH SACH CAC SINH VIEN QUA MON");
                    ds.quaMon();
                    break;
                case 4:
                    System.out.println("TIM SINH VIEN THEO MA");
                    ds.timSV();
                    break;
                case 0:
                    System.out.println("Cam on da su dung chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai roi ma");
                    break;
            }

            System.out.println("Su dung nua hong? (Y/N): ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                System.out.println("Cam on da su dung chuong trinh");
                break;
            }
        }
    }

}
