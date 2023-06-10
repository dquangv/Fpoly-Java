package asm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class QuanLyNhanVien extends NhanVien {

    public static void menu() {
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
    }

    public static void thongTinDauVao(ArrayList<NhanVien> dsNV) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dsNV.size(); i++) {
            System.out.print("Ma nhan vien: ");
            String maNV = sc.nextLine();
            System.out.print("Ho ten: ");
            String ten = sc.nextLine();
            System.out.println("Vi tri: ");
            String viTri = sc.nextLine();
            if (viTri.equalsIgnoreCase("Hanh chinh")) {
                NhanVien nvHC = new NhanVien();
                nvHC.setMaNV(maNV);
                nvHC.setHoTen(ten);
                nvHC.setviTri(viTri);
                System.out.println("Luong co ban: ");
                nvHC.setLuong(new BigDecimal(sc.nextLine()));
            } else if (viTri.equalsIgnoreCase("Tiep thi")) {

            } else if (viTri.equalsIgnoreCase("Truong phong")) {

            } else {
                System.out.println("Khong ton tai vi tri nay");
            }
        }
    }
}
