package asm;

import java.util.Scanner;

public class Asm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("*-------------------------------------------------------------------------------*");
            System.out.println("*\t\t\t\t\tMENU\t\t\t\t\t*");
            System.out.println("*\t 1. \tNhap danh sach nhan vien tu ban phim\t\t\t\t*");
            System.out.println("*\t 2. \tXuat danh sach nhan vien ra ban phim\t\t\t\t*");
            System.out.println("*\t 3. \tTim va hien thi nhan vien theo ma nhap tu ban phim\t\t*");
            System.out.println("*\t 4. \tXoa nhan vien theo ma nhap tu ban phim\t\t\t\t*");
            System.out.println("*\t 5. \tCap nhat thong tin nhan vien theo ma nhap tu ban phim\t\t*");
            System.out.println("*\t 6. \tTim cac nhan vien theo khoang luong nhap tu ban phim\t\t*");
            System.out.println("*\t 7. \tSap xep nhan vien theo ho va ten\t\t\t\t*");
            System.out.println("*\t 8. \tSap xep nhan vien theo thu nhap\t\t\t\t\t*");
            System.out.println("*\t 9. \tXuat 5 nhan vien co thu nhap cao nhat\t\t\t\t*");
            System.out.println("*\t 10. \tKet thuc chuong trinh\t\t\t\t\t\t*");
            System.out.println("*-------------------------------------------------------------------------------*");

            try {
                System.out.print("Chon chuc nang: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("NHAP DANH SACH NHAN VIEN TU BAN PHIM");
                        break;
                    case 2:
                        System.out.println("XUAT DANH SACH NHAN VIEN RA MAN HINH");
                        break;
                    case 3:
                        System.out.println("TIM VA HIEN THI NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        break;
                    case 4:
                        System.out.println("XOA NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        break;
                    case 5:
                        System.out.println("CAP NHAT THONG TIN NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        break;
                    case 6:
                        System.out.println("TIM CAC NHAN VIEN THEO KHOANG LUONG NHAP TU BAN PHIM");
                        break;
                    case 7:
                        System.out.println("SAP XEP NHAN VIEN THEO HO VA TEN");
                        break;
                    case 8:
                        System.out.println("SAP XEP NHAN VIEN THEO THU NHAP");
                        break;
                    case 9:
                        System.out.println("XUAT 5 NHAN VIEN CO THU NHAP CAO NHAT");
                        break;
                    default:
                        System.out.println("Cam on da su dung dich vu!");
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("nhap so tu 1 den 10 dum cai!");

            }
        } while (true);
    }

}
