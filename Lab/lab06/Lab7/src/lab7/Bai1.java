package lab7;

import java.util.Scanner;

public class Bai1 {

    public static class ChuNhat {

        Scanner sc = new Scanner(System.in);
        public double rong, dai;

        public double getRong() {
            return rong;
        }

        public void setRong(double rong) {
            this.rong = rong;
        }

        public double getDai() {
            return dai;
        }

        public void setDai(double dai) {
            this.dai = dai;
        }

        public double getChuVi() {
            return (dai + rong) * 2;
        }

        public double getDienTich() {
            return dai * rong;
        }

        public void nhap() {
            System.out.print("chieu dai: ");
            dai = Double.parseDouble(sc.nextLine());
            System.out.print("chieu rong: ");
            rong = Double.parseDouble(sc.nextLine());
        }

        public void xuat() {
            nhap();
            System.out.println("chieu dai: " + dai);
            System.out.println("chieu rong: " + rong);
            System.out.println("chu vi: " + getChuVi());
            System.out.println("dien tich: " + getDienTich());
        }
    }

    public static class Vuong extends ChuNhat {

        public double canh;

        public double getCanh() {
            return canh;
        }

        public void setCanh(double canh) {
            this.canh = canh;
        }

        @Override
        public double getChuVi() {
            return canh * 4;
        }

        @Override
        public double getDienTich() {
            return canh * canh;
        }

        @Override
        public void nhap() {
            System.out.print("canh: ");
            canh = Double.parseDouble(sc.nextLine());
        }

        @Override
        public void xuat() {
            nhap();
            System.out.println("canh: " + canh);
            System.out.println("chu vi: " + getChuVi());
            System.out.println("dien tich: " + getDienTich());
        }
    }
    
    public static void main(String[] args) {
        ChuNhat chunhat = new ChuNhat();
        ChuNhat vuong = new Vuong();
        chunhat.xuat();
        vuong.xuat();
    }

}
