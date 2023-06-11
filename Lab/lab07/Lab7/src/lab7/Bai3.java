package lab7;

import java.util.ArrayList;
import java.util.Scanner;
import lab7.Bai2.SinhVienPoly;

public class Bai3 {

    public static class SinhVienIT extends SinhVienPoly {

        public double java, html, css;

        public SinhVienIT(double java, double html, double css, String hoTen, String nganh) {
            super(hoTen, nganh);
            this.java = java;
            this.html = html;
            this.css = css;
        }

        public SinhVienIT(String hoTen, String nganh) {
            super(hoTen, nganh);
        }

        public void nhapdiem() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap diem java: ");
            java = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap diem html: ");
            html = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap diem css: ");
            css = Double.parseDouble(sc.nextLine());
        }

        @Override
        public double getDiem() {
            return (java * 2 + html + css) / 4;
        }
    }

    public static class SinhVienBiz extends SinhVienPoly {

        public double marketing, sales;

        public SinhVienBiz(String hoTen, String nganh) {
            super(hoTen, nganh);
        }

        public void nhapdiem() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap diem marketing: ");
            marketing = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap diem sales: ");
            sales = Double.parseDouble(sc.nextLine());
        }

        @Override
        public double getDiem() {
            return (marketing * 2 + sales) / 3;
        }
    }

    public static class dssv extends SinhVienPoly {

        ArrayList<SinhVienPoly> dssv = new ArrayList<>();

        public void nhapDSSV() {

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ho ten: ");
                hoTen = sc.nextLine();
                System.out.print("Nganh: ");
                nganh = sc.nextLine();

                if (nganh.equalsIgnoreCase("IT") || nganh.equalsIgnoreCase("sinh vien it")) {
                    SinhVienIT sv = new SinhVienIT(hoTen, nganh);
                    sv.nhapdiem();
                    sv.getDiem();
                    dssv.add(sv);
                } else if (nganh.equalsIgnoreCase("Marketing") || nganh.equalsIgnoreCase("sinh vien biz")) {
                    SinhVienBiz sv = new SinhVienBiz(hoTen, nganh);
                    sv.nhapdiem();
                    sv.getDiem();
                    dssv.add(sv);
                } else {
                    System.out.println("Truong nay chi co chuyen nganh IT va Marketing");
                }
                
                System.out.print("Nhap nua hong? (Y/N): ");
                String check = sc.nextLine();
                if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }

        public void xuatDSSV() {

            for (int i = 0; i < dssv.size(); i++) {
                dssv.get(i).xuat();
            }
        }

        @Override
        public double getDiem() {
            return 0;
        }
    }

    public static void main(String[] args) {
        dssv dssv = new dssv();
        dssv.nhapDSSV();
        dssv.xuatDSSV();
    }
}
