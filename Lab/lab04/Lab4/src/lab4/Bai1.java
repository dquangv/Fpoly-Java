package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    public class SanPham {

        public String tenSp;
        public double donGia, giamGia;

        public SanPham(String tenSp, double donGia, double giamGia) {
            this.tenSp = tenSp;
            this.donGia = donGia;
            this.giamGia = giamGia;
        }

        public double getThueNhapKhau() {
            double thue = this.donGia * 0.1;
            return thue;
        }

        public String getTen() {
            return tenSp;
        }

        public double getDonGia() {
            return donGia;
        }

        public double getGiamGia() {
            return giamGia;
        }
    }

    public ArrayList<SanPham> nhapSanPham(int num) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> sanPham = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.print("Ten san pham: ");
            String tenSp = sc.nextLine();
            System.out.print("Don gia: ");
            double donGia = sc.nextDouble();
            System.out.print("Giam gia: ");
            double giamGia = sc.nextDouble();
            sc.nextLine();

            SanPham sp = new SanPham(tenSp, donGia, giamGia);
            sanPham.add(sp);
        }

        return sanPham;
    }

    public void xuatSanPham() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong san pham: ");
        int num = sc.nextInt();
        sc.nextLine();

        ArrayList<SanPham> sanPham = nhapSanPham(num);

        for (int i = 0; i < num; i++) {
            System.out.println("San pham " + (i + 1));
            System.out.println("Ten san pham: " + sanPham.get(i).getTen());
            System.out.println("Don gia: " + sanPham.get(i).getDonGia());
            System.out.println("Giam gia: " + sanPham.get(i).getGiamGia());
            System.out.println("Thue nhap khau: " + sanPham.get(i).getThueNhapKhau());
        }

    }
    
    public static void main(String[] args) {
        Bai1 sanPham = new Bai1();
        sanPham.xuatSanPham();
    }
}
