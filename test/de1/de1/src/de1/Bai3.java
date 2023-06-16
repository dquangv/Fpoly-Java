package de1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public static class SinhVien {
        String hoTen, maSV;
        double diem;

        public SinhVien(String hoTen, String maSV, double diem) {
            this.hoTen = hoTen;
            this.maSV = maSV;
            this.diem = diem;
        }
        
        public SinhVien() {
            
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getMaSV() {
            return maSV;
        }

        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }

        public double getDiem() {
            return diem;
        }

        public void setDiem(double diem) {
            this.diem = diem;
        }
        
        public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ho ten sinh vien: ");
            setHoTen(sc.nextLine());
            System.out.println("Ma so sinh vien: ");
            setMaSV(sc.nextLine());
            System.out.println("Diem: ");
            setDiem(Double.parseDouble(sc.nextLine()));
        }
        
        public void xepLoai() {
            if (getDiem() >= 9) {
                System.out.println("Xep loai: Gioi");
            } else if (getDiem() >=7) {
                System.out.println("Xep loai: Kha");
            } else if (getDiem() >= 5) {
                System.out.println("Xep loai: Trung binh");
            } else {
                System.out.println("Xep loai: Yeu");
            }
        }
        
        public void xuat() {
            System.out.println("Ho ten sinh vien: "+getHoTen());
            System.out.println("Ma so sinh vien: " +getMaSV());
            System.out.println("Diem: "+getDiem());
            xepLoai();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        System.out.println("Nhap so luong sinh vien: ");
        int num = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i<num;i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            dsSV.add(sv);
        }
        
        for (SinhVien sv: dsSV) {
            sv.xuat();
        }
    }
}
